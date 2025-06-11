You've made a lot of progress in the class, it shows! This is a good demonstration of beginner level work. The core functionality works well. We have a few things to work on with naming and style, but these are minor things to work on.

**OVERALL: Passed**

Minor Tweaks:

* `rentLocker()` method prints directly to console - violates separation of concerns.

* Dead Code:
  ```java
  private Locker[] pinList; // This field is never used - remove it
  ```

* `viewLockerList()` and `releaseLockerList()` have misleading names, better names: `displayRentedLockers()` or `showAvailableLockers()`

* Both `viewLockerList()` and `releaseLockerList()` have identical logic.

* In general, the service class shouldn't print or receive input from the terminal. It should return data and let the caller decide what to do with the output.

* Start thinking about using booleans directly in if statements. Your code isn't wrong, but we want to start moving you towards how professionals would write this:
  ```java
  // this is correct
  if (lockerList[i] != null && lockerList[i].isRented() == false) {
  // this is better, see the !
    if (lockerList[i] != null && !lockerList[i].isRented()) { 
  ```

* Consider storing a capacity or max size field, right now you're setting the number of lockers, but you've hard coded the range:
  ```java
  LockerService service = new LockerService(100); // this would support other sizes
  // this is hard coded to 100, if the locker service size changes this code will cause errors.
  if (userLocker < 1 || userLocker > 100) { 
  ```

* Code cleanup! Remove extra lines when you're done:
  ```java
      public static void print(String msg) {
          System.out.println(msg);
  
  
      }
  ```

* Consider returning a method result directly instead of making an extra variable. This is fine as is right now, but as you get stronger, you'll want to use the shorter syntax:
  ```java
  // Instead of:
  public static String getInput() {
      String userInput = input.nextLine();
      return userInput;
  }
  
  // Simply use:
  public static String getInput() {
      return input.nextLine();
  }
  ```

  