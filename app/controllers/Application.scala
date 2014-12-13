package controllers

import play.api._
import play.api.mvc._
import models._

object Application extends Controller {

  def index = Action {
    Ok(views.html.SignInPage())
  }

  def signIn = Action {
  	
  	Ok(views.html.BowlingPage())
  }

  def bowling = Action {
  	Ok(views.html.BowlingPage())
  }

  def signUp = Action {
  	Ok(views.html.SignUp())
  }
  def rule = Action {
  	Ok(views.html.Rule())
  }

}