//  Define a constant for a versatile message
let dreamBigMessage = "Dream Big!"


//  Define a function to log the dream big message
func logDreamBigMessage() {
    print(dreamBigMessage)
}


//  Define a structure to store dream related data
struct DreamData {
    var goal: String
    var date: Date
    var complete: Bool
}


//  Define a class to manage a collection of dream data
class DreamManager {
    
    //  Define a variable to store dreams
    var dreams = [DreamData]()
    
    //  Define an initializer to take in an array of dream data
    init(_ data: [DreamData]) {
        self.dreams = data
    }
    
    //  Define a method to add dream data to the array
    func addDream(_ dream: DreamData) {
        dreams.append(dream)
    }
    
    //  Define a method to check if dream data is complete
    func isDreamComplete(_ dream: DreamData) -> Bool {
        return dream.complete
    }
    
    //  Define a method to log all dreams
    func logDreams() {
        for dream in dreams {
            print("Goal: \(dream.goal) \nDate: \(dream.date) \nComplete: \(dream.complete)\n")
        }
    }
}


//  Define a class representing a person and their dreams
class Person {
    
    //  Define a property to store the person's name
    var name: String
    
    //  Define a property to store the dream manager
    var dreamManager = DreamManager([DreamData]())
    
    //  Define an initializer to take in a name
    init(_ name: String) {
        self.name = name
    }
    
    //  Define a method to add a dream
    func addDream(goal: String, date: Date, complete: Bool) {
        let dream = DreamData(goal: goal, date: date, complete: complete)
        dreamManager.addDream(dream)
    }
    
    //  Define a method to check if a dream has been completed
    func checkDreamComplete(goal: String) -> Bool {
        for dream in dreamManager.dreams {
            if goal == dream.goal {
                return dreamManager.isDreamComplete(dream)
            }
        }
        return false
    }
    
    //  Define a method to log all dreams
    func logDreams() {
        dreamManager.logDreams()
    }
    
    //  Define a method to log the dream big message
    func logDreamBigMessage() {
        logDreamBigMessage()
    }
}


//  Define a class representing a dream factory
class DreamFactory {
    
    //  Define an array to store person objects
    var people = [Person]()
    
    //  Define a method to add a person to the array
    func addPerson(_ person: Person) {
        people.append(person)
    }
    
    //  Define a method to log all people
    func logPeople() {
        for person in people {
            print(person.name)
        }
    }
    
    //  Define a method to log all dreams
    func logDreams() {
        for person in people {
            person.logDreams()
        }
    }
    
    //  Define a method to log the dream big message
    func logDreamBigMessage() {
        for person in people {
            person.logDreamBigMessage()
        }
    }
}


//  Create a dream factory
let dreamFactory = DreamFactory()

//  Create person objects and add to the dream factory
let person1 = Person("Alice")
let person2 = Person("Bob")
dreamFactory.addPerson(person1)
dreamFactory.addPerson(person2)

//  Add dreams for the 2 people
person1.addDream(goal: "Become a doctor", date: Date(), complete: false)
person1.addDream(goal: "Travel the world", date: Date(), complete: false)
person2.addDream(goal: "Buy a house", date: Date(), complete: false)
person2.addDream(goal: "Start a business", date: Date(), complete: true)

//  Log the 2 people
dreamFactory.logPeople()

//  Log all the dreams
dreamFactory.logDreams()

//  Check if Bob's 'buy a house' dream is complete
if dreamFactory.people[1].checkDreamComplete(goal: "Buy a house") {
    print("Bob's 'Buy a house' dream is complete!")
} else {
    print("Bob's 'Buy a house' dream is not complete.")
}

//  Log the dream big message
dreamFactory.logDreamBigMessage()