// Notes on Interfaces:
// Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)
// Why And When To Use Interfaces?
// 1) To achieve security - hide certain details and only show the important details of an object (interface).

// 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below)

interface interfaces {

    public static final int a =1;
    void test();
    abstract void  test1();

    public default void test2(){ //latrsly introduced by java 9 and interface are not ay more the pure abstrartion
        System.out.println("panindra");
    }

}

// In Java, interfaces were traditionally pure abstract classes, meaning 
// they could only declare method signatures without any implementation. However, starting from Java8,
//  interfaces evolved to support default methods and static methods, which allow them to
//   include method implementations. Despite this change,
//    interfaces are still not considered "pure abstract classes" for several reasons:


// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal interface
  class Pig implements Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }
  
  class Mainq {
    public static void main(String[] args) {
      Pig myPig = new Pig();  // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
}

// ============another example===============
// Interface for Wi-Fi Connectivity
interface WifiConnectable {
    void connectToWifi(String networkName);
    void disconnectWifi();
    boolean isWifiConnected();
}

// Interface for Media Playback
interface MediaPlayable {
    void playMedia(String mediaFile);
    void stopMedia();
    void adjustVolume(int volumeLevel);
}

// Interface for Home Appliance Control
interface ApplianceControllable {
    void turnOnAppliance(String applianceName);
    void turnOffAppliance(String applianceName);
    void setApplianceSettings(String applianceName, String settings);
}

// Concrete class SmartTV implementing multiple interfaces
class SmartTV implements WifiConnectable, MediaPlayable, ApplianceControllable {

    private boolean wifiConnected = false;
    private String currentMedia = null;
    private int volume = 50; // Default volume

    // Implementation of WifiConnectable interface methods
    @Override
    public void connectToWifi(String networkName) {
        System.out.println("SmartTV connecting to Wi-Fi network: " + networkName);
        wifiConnected = true;
    }

    @Override
    public void disconnectWifi() {
        System.out.println("SmartTV disconnecting from Wi-Fi");
        wifiConnected = false;
    }

    @Override
    public boolean isWifiConnected() {
        return wifiConnected;
    }

    // Implementation of MediaPlayable interface methods
    @Override
    public void playMedia(String mediaFile) {
        System.out.println("SmartTV playing media: " + mediaFile);
        currentMedia = mediaFile;
    }

    @Override
    public void stopMedia() {
        System.out.println("SmartTV stopping media playback");
        currentMedia = null;
    }

    @Override
    public void adjustVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            volume = volumeLevel;
            System.out.println("SmartTV volume set to: " + volume);
        } else {
            System.out.println("Invalid volume level. Volume must be between 0 and 100.");
        }
    }

    // Implementation of ApplianceControllable interface methods
    @Override
    public void turnOnAppliance(String applianceName) {
        System.out.println("SmartTV turning ON appliance: " + applianceName);
        // Code to control appliance (e.g., using network commands) would go here
    }

    @Override
    public void turnOffAppliance(String applianceName) {
        System.out.println("SmartTV turning OFF appliance: " + applianceName);
        // Code to control appliance would go here
    }

    @Override
    public void setApplianceSettings(String applianceName, String settings) {
        System.out.println("SmartTV setting " + applianceName + " settings to: " + settings);
        // Code to set appliance settings would go here
    }

    public static void main(String[] args) {
        SmartTV myTV = new SmartTV();
        WifiConnectable wifiRef = new SmartTV();

        // Using WifiConnectable functionalities
        myTV.connectToWifi("HomeNetwork");
        System.out.println("Is Wi-Fi connected? " + myTV.isWifiConnected());

        // Using MediaPlayable functionalities
        myTV.playMedia("Nature Documentary.mp4");
        myTV.adjustVolume(60);

        // Using ApplianceControllable functionalities
        myTV.turnOnAppliance("Smart Lights");
        myTV.setApplianceSettings("Thermostat", "Temperature: 22C");
        //
        wifiRef.connectToWifi("HomeNetwork");
    }
}




// smallest example
interface Washable {
    void wash();
}

class Shirt implements Washable { public void wash() { System.out.println("Washing shirt"); } }
class Pants implements Washable { public void wash() { System.out.println("Washing pants"); } }

public class Laundry {
    public static void main(String[] args) {
        Washable item1 = new Shirt(); // Washable reference to a Shirt
        Washable item2 = new Pants(); // Washable reference to Pants

        item1.wash(); // Calls Shirt's wash()
        item2.wash(); // Calls Pants' wash()
    }
}
  