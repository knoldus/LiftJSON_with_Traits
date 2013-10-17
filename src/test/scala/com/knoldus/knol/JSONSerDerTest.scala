package com.knoldus.knol

import org.scalatest.FunSuite
import net.liftweb.json.Serialization.write
import net.liftweb.json.parse
import com.knoldus.knol.util.LiftJsonHelper

class JSONSerDerTest extends FunSuite with LiftJsonHelper {
  test("JSON serialization of Analysis data") {
    val analysis = new Analysis("TwitterAnalysis", List(new EmotionReducer("Emo1", 0.1), new SentimentReducer("Sen1", 0.5)))

    val jsonAnalysis = write(analysis)
    assert(jsonAnalysis === """{"dataCubeName":"TwitterAnalysis","reductionSteps":[{"type":"EmotionReducer","name":"Emo1","coefficientLevel":0.1},{"type":"SentimentReducer","name":"Sen1","coefficientLevel":0.5}]}""")
  }

  test("Parsing of Analysis JSON String into Analysis class") {
    val jsonAnalysis = """{"dataCubeName":"TwitterAnalysis","reductionSteps":[{"type":"EmotionReducer","name":"Emo1","coefficientLevel":0.1},{"type":"SentimentReducer","name":"Sen1","coefficientLevel":0.5}]}"""
    val analysis = parse(jsonAnalysis).extract[Analysis]
    assert(analysis.reductionSteps(0).isInstanceOf[EmotionReducer])
  }
}