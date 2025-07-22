{// let s = "abcabcbb";
// let buffer= []
// for(i =0; i<s.length; i++){
//     subsing =""
//     for(j =i; j<s.length; j++){
//         subsing = subsing+ s[j]
//         buffer.push(subsing)
//     }
// }
// console.log(buffer)


// for(t =0; t<buffer.length; t++){
//     for(c =t+1; c<buffer.length; c++){
//         buffer[t]==buffer[c]? buffer.splice(c):null
//     }
// }
// console.log(buffer)
// let maxnuber = 0;
// let index="";
// for(each in buffer){index = each.length>maxnuber? each:""}
// console.log(buffer[index].length)


// sliding window pattern solution
}


{//chekc the number as a palindrome

// let a = 0;
// var isPalindrome = function(x) {
//         let check = x
//         let reversed = 0
//         while (x >0){
//             let last_digit = x%10;
//             x= Math.floor(x/10);
//             if(x>0 && x<10 && x!==check%10){
//                     return false;
//                 }
//             reversed = reversed*10 + last_digit;
//         }
//         return check === reversed? true: false
    
// };
// console.log(isPalindrome(a)); // Output: true or false based on whether the number is a palindrome

// var isPalindrome = function(x) {
//  if (x < 0 || (x % 10 === 0 && x !== 0)) return false;
//     let reversed = 0;
//     while (x > reversed) {
//         reversed = reversed * 10 + x % 10 | 0;
//         x = (x / 10) | 0;
//     }
//     return x === reversed || x === (reversed / 10 | 0);
// }
}



{//give a string or brackets chcekc if they are balanced?
// let data = "({[]})";
// let pointer = 0;
// let st = [];
// let out=true
// while(pointer<data.length){
//     let current =data.charAt(pointer)
//     let last_element = st[st.length-1];
//     if(current=="(" || current =="[" || current=="{"){
//         st.push(data.charAt(pointer));
//         pointer++;
//     }
//     else if(st.length >0){
//         if((current==")" && last_element=="(") || (current=="}" && last_element=="{") || (current=="]" && last_element=="[")){
//             st.pop();
//             pointer++;
//         }
//         else{
//             out = "false"
//             break; //return false;
//         }
//     }
// }
// console.log(out)
//  && (data.charAt(pointer)===")" || data.charAt(pointer)==="}" || data.charAt(pointer)==="]")
}



{//add two sorted linked lists
    
// function ListNode(val, next = null){
//     this.val = val
//     this .next = next
// }
// var mergeTwoLists = function(list1, list2) {
//     let merged =[]
//     let head = new ListNode(0)
//     let current = head
//     // list1=list1
//     // list2= list2
//     while(list1 && list2)
//     {
//         if(list1.val>list2.val){
//             current.next = new ListNode(list2.val);
//             current = current.next
//             list2 = list2.next;
//         }
//         else{
//             current.next = new ListNode(list1.val);
//             current = current.next
//             list1 = list1.next;
//         }

//     }
//     if(list1){
//         current.next = list1;
//     }
//     else if(list2){
//         current.next = list2;
//     }
//     return head.next;
// };
}



{//Remove Duplicates from Sorted Array
//     var removeDuplicates = function(nums) {
//     let stack = new Array(nums.length)
//     let pointer = 1;
//     stack.push(nums[0])
//     while(pointer<nums.length){
//         if(nums[pointer]!=stack[stack.length-1]){
//             stack.push(nums[pointer])
//             pointer++;
//             continue;
//         }
//         pointer++;
//     }
//     return stack
// };
// console.log(removeDuplicates([0,0,0,1,1,2,3,4,4,5,6,6,7]))
}



{//reverse a array of cahracters
//     var reverseString = function(s) {

     
//      let a = s.length;
//      while(a>s.length/2){
//         let temp = s[s.length - a]
//         s[s.length - a] = s[a-1]
//         s[a-1]=temp
//         a--;
//      }
//      return s;
    
// };
// console.log(reverseString(["H","a","n","n","a","h"]))

}


{//revers a string afor k intergers
// var reverseStr = function(s, k) {
//     s = new Array(...s);
//     let a =0;
//     while(a< s.length){
//         let left = a;
//         let right = Math.min(a + k - 1, s.length - 1);
//         while(left<right){
//             let temp = s[left]
//             s[left] = s[right];
//             s[right] = temp;
//             left++; right--;
//         }
//         a += 2 * k;
//     }
//     s = s.join('');
//     return s;
// };
// console.log(reverseStr("abcdefg", 2)) // Output: "bacdfe"
}




{//revers a string afor k intergers
let a =[]
var climbStairs = function(n) {
    console.log(a)
    if(n <= 2) return n;
    if(a[n]) return a[n];
    a[n] = climbStairs(n - 1) +     climbStairs(n - 2);
    return a[n];
};
console.log(climbStairs(5)); // Output: 8
}
