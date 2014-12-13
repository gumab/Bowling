package models

case class UserM(
  username: String, 
  password: String,
  profile: UserProfileM
)

case class UserProfileM(
  country: String,
  address: Option[String],
  age: Option[Int]
)