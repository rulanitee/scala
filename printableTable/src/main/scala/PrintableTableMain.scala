import scala.collection.mutable.ListBuffer

/**
  * Created by dev on 7/2/18.
  */
object PrintableTableMain {

  case class Student(studentId: String, name: String, surname: String, dateOfBirth: String, address: String)

  def main(args: Array[String]): Unit = {

    val headers = List("StudentId", "Name", "Surname", "DateOfBirth", "Address")
    var rows = new ListBuffer[List[String]]()
    rows += headers
    for(student <- students){
      var row = List(s"${student.studentId}", s"${student.name}", s"${student.surname}", s"${student.dateOfBirth}", s"${student.address}")
      rows += row
    }

    println(s"${PrintableTable.format(rows)}")

  }

  val students: Seq[Student] = Seq(
    new Student("001", "Frank", "Loo", "30/03/2001", "Water loo"),
    new Student("002", "Mike", "Koo", "12/05/2001", "Sandton"),
    new Student("003", "Charles", "Ling", "22/08/2001", "Randburg"),
    new Student("004", "John", "Doe", "01/01/2001", "Pretoria"))

}
