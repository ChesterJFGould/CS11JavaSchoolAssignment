# Java school assignment for vln programming 11
## Disclaimer
If you are also taking programming 11, DO NOT copy this as there are a lot of things that will make it obvious it is copied if the teacher checks against other turned in assignments, oh and it's plagiarism. That being said, feel free to use this as a reference if you are stuck.

## Notes
This assignment was written and tested on version 12.0.1 of openJDK running on Arch Linux, kernel version 5.1.12-arch. If for some reason it does not compile on your machine, please switch to the specified openJDK and linux versions, just kidding message me and we'll sort it out.

I have added some additional things to the School class as it felt weird that the courses list was unused. When a teacher is added and their subject isn't in the courses list their subject is added to that list. When a teacher is removed and they were the only teacher teaching their subject, their subject is removed from the list. I also print out the courses when teachers and students are printed.

In the Main class some teachers and students are randomly generated, this isn't required by the assignment but I didn't feel like writing out 13 school.AddTeacher/Student statements. The random int generator also uses java.util.concurrent.ThreadLocalRandom instead of java.util.Random because it's nicer :).