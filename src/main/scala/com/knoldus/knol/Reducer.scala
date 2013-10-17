package com.knoldus.knol

trait Reducer 

case class SentimentReducer(name:String, coefficientLevel:Double) extends Reducer

case class EmotionReducer(name:String, coefficientLevel:Double) extends Reducer

case class Analysis(dataCubeName:String, reductionSteps:List[Reducer])