package example

import scala.collection.JavaConverters._
object Main extends App {
  val a = new com.example.thriftjava.ExampleStruct()
  a.setExampleId(1)
  a.setExampleContent("java")

  val b = com.example.thriftscala.ExampleStruct(
    2,
    Some("scala")
  )

  println(a)
  println(b)
}
