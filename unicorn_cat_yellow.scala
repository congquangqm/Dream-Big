// File Name: DreamBig.scala

// 1
object DreamBig {
  def main(args: Array[String]): Unit = {
    println("Dream Big")
    println("You Can Do Anything")
  }
}

// 2
class BigDreamer(name: String) {
  def dream(message: String) = {
    println(s"${name}: ${message}")
  }
}

// 3
object GenerateBigDreamers {
  def generateBigDreamers(names: Seq[String]): Seq[BigDreamer] = {
    names.map(name => new BigDreamer(name))
  }
}

// 4
object DreamBigApp extends App {
  val bigDreamers = GenerateBigDreamers.generateBigDreamers(Seq("John", "Jane", "Max"))
  bigDreamers.foreach(_.dream("Dream Big!"))
}

// 5
object Utils {
  def getDreamMessage(name: String): String = {
    s"${name}, Dare to Dream Big!"
  }
}

// 6
object Utils {
  def getDreamMessage(name: String): String = {
    s"${name}, Dare to Dream Big!"
  }

  def buildEncouragingMessage(name: String, message: String): String = {
    s"${name}: ${message} Keep Going!"
  }
}

// 7
object Utils {
  def getDreamMessage(name: String): String = {
    s"${name}, Dare to Dream Big!"
  }

  def buildEncouragingMessage(name: String, message: String): String = {
    s"${name}: ${message} Keep Going!"
  }

  def isDreamTooBig(dream: String): Boolean = {
    dream match {
      case dream if dream.length > 100 => true
      case _                           => false
    }
  }
}

// 8
class MotivationalSpeaker(name: String, message: String) {
  def getMotivation = {
    Utils.buildEncouragingMessage(name, message)
  }
}

// 9
object MotivationalSpeaker {
  def apply(name: String, message: String): MotivationalSpeaker = {
    new MotivationalSpeaker(name, message)
  }
}

// 10
object TestDreamMessages {
  def main(args: Array[String]): Unit = {
    val dream = "This Is My Dream"
    assert(Utils.isDreamTooBig(dream) == false)

    val speaker = MotivationalSpeaker("John","Dream Big!")
    val motivation = speaker.getMotivation
    assert(motivation == "John: Dream Big! Keep Going!")
  }
}

// 11
object BigDreamersService {
  def getDreamers(): Seq[BigDreamer] = {
    GenerateBigDreamers.generateBigDreamers(Seq("John", "Jane", "Max"))
  }
}

// 12
object BigDreamersApp {
  def main(args: Array[String]): Unit = {
    BigDreamersService.getDreamers().foreach { dreamer =>
      val message = Utils.getDreamMessage(dreamer.name)
      dreamer.dream(message)
    }
  }
}

// 13
object InspirationApp {
  def main(args: Array[String]): Unit = {
    val inspirationalQuotes = Seq(
      "You have the power within you to achieve anything you want",
      "The future belongs to those who believe in the beauty of their dreams",
      "A dream is just a dream until you decide to make it real"
    )
     
    inspirationalQuotes.foreach(quote => println(quote))
  }
}

// 14
case class DreamerStory(name: String, dream: String)

// 15
object DreamersStories {
  def getStories(): Seq[DreamerStory] = {
    Seq(
      DreamerStory("John", "Build a space rocket"),
      DreamerStory("Jane", "Cure cancer"),
      DreamerStory("Max", "Fly like a bird")
    )
  }
}

// 16
object DreamersStoriesApp {
  def main(args: Array[String]): Unit = {
    val stories = DreamersStories.getStories()
    stories.foreach { story =>
      println(s"${story.name} has a dream to ${story.dream}")
    }
  }
}

// 17
object DreamersSociety {
  def buildSociety(dreamers: Seq[BigDreamer]): Unit = {
    dreamers.foreach { dreamer =>
      println(s"Welcome, ${dreamer.name}. Let's make your dreams come true!")
    }
  }
}

// 18
object DreamersSocietyApp {
  def main(args: Array[String]): Unit = {
    val dreamers = BigDreamersService.getDreamers()
    DreamersSociety.buildSociety(dreamers)
  }
}

// 19
object BigDreamersActions {
  def helpDreamers(dreamers: Seq[BigDreamer]): Unit = {
    dreamers.foreach { dreamer =>
      println(s"Let's make ${dreamer.name}'s dreams come true!")
    }
  }
}

// 20
object BigDreamersActionsApp {
  def main(args: Array[String]): Unit = {
    val dreamers = BigDreamersService.getDreamers()
    BigDreamersActions.helpDreamers(dreamers)
  }
}