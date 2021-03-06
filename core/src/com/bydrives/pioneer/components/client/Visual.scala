package com.bydrives.pioneer.components.client

import com.artemis.Component
import com.badlogic.gdx.graphics.Texture

/**
 * Created by ivesv on 10/10/2015.
 * Adds visual to Entity
 * @param texture The visual itself
 */
case class Visual(var texture: Texture, var width: Float, var height: Float) extends Component {
  def this() = this(null,1,1)
}
