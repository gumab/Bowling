package controllers

import play.api._
import play.api.mvc._
import models._

object Application extends Controller {

  def index = Action {
    Ok(views.html.SignInPage())
  }

  def signIn(iid:Int) = Action {
  	
  	var isBonus=false

  	if(iid==11){
  		isBonus=true
  	}
  	Ok(views.html.BowlingPage(isBonus,iid))
  }

  def bowling = Action {
  	Ok(views.html.BowlingPage(true,10))
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