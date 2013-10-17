name := "liftjson_with_traits"

version := "0.1"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
	"org.scalatest" 		%% 	"scalatest" 		% 	"1.9.2",
	"junit" 				% 	"junit" 			% 	"4.11" ,
	"net.liftweb" 			%% 	"lift-json" 		% 	"2.5.1",
  	"org.specs2"          	%%  "specs2"        	% 	"1.14" % "test"
)
