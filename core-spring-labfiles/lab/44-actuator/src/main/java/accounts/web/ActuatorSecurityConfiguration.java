package accounts.web;

// TODO-21: Add Spring Boot security starter to the pom.xml or build.gradle
// - You might want to refresh the IDE so that it picks up the change in the build file
//
// TODO-22: Uncomment code below until there is no compile error

//import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint;
import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ActuatorSecurityConfiguration {

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        // TODO-23: Configure access control to actuator endpoints as following
//        // - Anybody can access "health" and "info" endpoints
//        // - ADMIN role can access "conditions" endpoint
//        // - ACTUATOR role can access all the other endpoints
//
//         @formatter:off
        http.authorizeHttpRequests((authz) -> authz
                        .requestMatchers(EndpointRequest.to(HealthEndpoint.class, InfoEndpoint.class)).permitAll()
                        .requestMatchers(EndpointRequest.to(ConditionsReportEndpoint.class)).hasRole("ADMIN")
                        .requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("ACTUATOR")
                        .anyRequest().authenticated())
                .httpBasic(withDefaults())
                .csrf(CsrfConfigurer::disable);
//         @formatter:on

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {

        UserDetails actuator = User.withUsername("actuator").password(passwordEncoder.encode("actuator")).roles("ACTUATOR").build();
        UserDetails admin = User.withUsername("admin").password(passwordEncoder.encode("admin")).roles("ACTUATOR", "ADMIN").build();

        return new InMemoryUserDetailsManager(actuator, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
