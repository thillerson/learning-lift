package com.liftworkshop.snippet

import scala.xml.{NodeSeq}
import com.liftworkshop._
import model._

class Util {
	def ifLoggedIn(html:NodeSeq) = if (User.loggedIn_?) html else NodeSeq.Empty
	def ifLoggedOut(html:NodeSeq) = if (! User.loggedIn_?) html else NodeSeq.Empty
}