# Restaurant Class Ideas

### Properties
- int waitTime
- double Rating
- double avgPrice
- double distance
- String hoursOpen
<!-- Menu Items (Type?)-->

# Summary of Requirements

### 1. User Interactions
We learned how to develop a main method that would take input data from the user (by means of the JOptionPane) and extract the data by parsing to create values for the restaurant (instantiating). The wait time, rating, distance, hours open, name, and average price were all variables we needed to create and we could extract the values based on the data types (e.x. Integer.parseInt for integers). 

### 2. Getters and Setters
We decided to make our restaurant variables private that way the main method couldn't just pull the data whenever it wanted (encapsulation). It's because of this that we needed to implement getter and setter functions to pull this data from the restaurant class to main. The getter functions would pull the values from the private variables while the setter functions would adjust the value amount. This ensures the data can't be pulled whenever and changed freely.

### 3. Array List
Since our app is designed to allow people to create restaurants and enter data, we can't just have one restaurant they can input data for. We added an ArrayList so that we could add multiple restaurants to our program. Each time a restaurant is created it's a unqiue Restaurant object created by the user. This specific object, as well as any other restaurants created, are stored in the ArrayList. This allows users to keep restaurants stored in the program, as well as add more restaurants to the list using the program.

### 4. toString()
When we originally ran our program, it worked fine except when it came to printing the data. Instead of printing the data entered, it printed a word with a hash code. This is because Java doesn't understand we wanted the data entered to be printed as it was entered. We had to use the toString() function to avoid this. It basically goes to Java's code and makes it so that instead of printing an object with a hash code, it prints a neatly formatted String. In doing this, we could format the String the way we wanted to that it could print to the console neatly. 
