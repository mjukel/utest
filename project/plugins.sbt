
val scalaJSVersion = "1.0.0-M3"

addSbtPlugin("com.dwijnand"      % "sbt-dynver"               % "2.0.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"                  % "1.1.1")
addSbtPlugin("org.scala-js"      % "sbt-scalajs"              % scalaJSVersion)
addSbtPlugin("org.scala-native"  % "sbt-scala-native"         % "0.3.7" exclude("org.scala-native", "sbt-crossproject"))
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.5.1-KH")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.5.1-KH")

