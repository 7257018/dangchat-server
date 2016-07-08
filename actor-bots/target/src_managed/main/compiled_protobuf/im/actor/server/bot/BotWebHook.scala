// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package im.actor.server.bot



@SerialVersionUID(0L)
final case class BotWebHook(
    userId: Int = 0,
    name: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[BotWebHook] with com.trueaccord.lenses.Updatable[BotWebHook] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      if (userId != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, userId) }
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, name) }
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = userId
        if (__v != 0) {
          output.writeInt32(1, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          output.writeString(2, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): im.actor.server.bot.BotWebHook = {
      var __userId = this.userId
      var __name = this.name
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __userId = __input.readInt32()
          case 18 =>
            __name = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      im.actor.server.bot.BotWebHook(
          userId = __userId,
          name = __name
      )
    }
    def withUserId(__v: Int): BotWebHook = copy(userId = __v)
    def withName(__v: String): BotWebHook = copy(name = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = userId
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = name
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = im.actor.server.bot.BotWebHook
}

object BotWebHook extends com.trueaccord.scalapb.GeneratedMessageCompanion[BotWebHook]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[BotWebHook]  = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): im.actor.server.bot.BotWebHook = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    im.actor.server.bot.BotWebHook(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = BotProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = im.actor.server.bot.BotWebHook(
  )
  implicit class BotWebHookLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, BotWebHook]) extends com.trueaccord.lenses.ObjectLens[UpperPB, BotWebHook](_l) {
    def userId: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.userId)((c_, f_) => c_.copy(userId = f_))
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
  }
  final val USER_ID_FIELD_NUMBER = 1
  final val NAME_FIELD_NUMBER = 2
}
