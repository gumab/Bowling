package controllers

import play.api._
import play.api.mvc._
import models._

object Application extends Controller {

  def index = Action {
    Ok(views.html.SignInPage())
  }

  def signIn(throws:String) = Action {
  	
  	var isBonus=false

  	var length=throws.length

  	if(length>20){
  		isBonus=true
  	}
  	Ok(views.html.BowlingPage(isBonus,length,throws,length))
  }

  def bowling = Action {
  	Ok(views.html.BowlingPage(true,5,"hello",4))
  }

  def signUp = Action {
  	Ok(views.html.SignUp())
  }
  def rule = Action {
  	Ok(views.html.Rule())
  }
  def history=Action{
  	Ok(views.html.History())
  }

}