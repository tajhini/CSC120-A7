Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?
sellCoffee()
I decided to overload the sellCoffee() method as it was given as an example in class.
I overloaded it by a version of the sellCoffee method that would respond if the user did not enter a coffee order.
I also overloaded it by adding a version that would allow a user to order a predetermined coffee order.

isResident()
I decided to overload the isResident() method to be used as a method of bug checking. If the user does not enter the name of a resident, it makes the user aware of this and requests that they enter a Resident's name.

checkOut()
I changed the intial checkOut method to have set number of days for a title to be checked out then added another method that allowed the user to specify how many days they would like to check out a title.

I overloaded the sub class constuctors to build the subclass with only the most basic information 


- What worked, what didn't, what advice would you give someone taking this course in the future?

I tried to overload the addTitle() and checkOut() to be able to accept multiple titles at once but ran into a problem. I originally made the paramters for this version Arrays but then I realised I could not just add arrays as a parameter for the method. I realised I could enter it as a string then split the different titles then place those into an array. All of this was essentially useless as I realised I would have two methods of the same type.

Everything else went very smoothly. I'm getting to point where I don't have to look up what the syntax is a much. 

Advice: 
Being creative is super important in this course. Being creative really helps with the problem solving aspect of coding. Once you eventually get the syntax, Java isn't so bad.

The `Library` class has a `goToFloor(...)` method that allows movement between non-adjacent floors. I interepreted this as not needing to override this method at all.