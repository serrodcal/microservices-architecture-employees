package server

import actors.EmployeeRouterActor.Employee
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json._

/**
  * Created by serrodcal on 2/3/17.
  */
// collect your json format instances into a support trait:
trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val employeeFormat = jsonFormat2(Employee)
}
