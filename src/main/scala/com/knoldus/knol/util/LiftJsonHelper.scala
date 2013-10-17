package com.knoldus.knol.util

import net.liftweb.json.DefaultFormats
import net.liftweb.json.ShortTypeHints
import com.knoldus.knol.SentimentReducer
import com.knoldus.knol.EmotionReducer

trait LiftJsonHelper {
  implicit val formats = new DefaultFormats { outer =>
    override val typeHintFieldName = "type"
    override val typeHints = ShortTypeHints(List(classOf[SentimentReducer], classOf[EmotionReducer]))
  }
}