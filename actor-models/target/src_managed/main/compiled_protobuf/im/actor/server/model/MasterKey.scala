// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package im.actor.server.model


import im.actor.server.model.ModelTypeMappers._

@SerialVersionUID(0L)
final case class MasterKey(
    authId: Long = 0L,
    body: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MasterKey] with com.trueaccord.lenses.Updatable[MasterKey] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      if (authId != 0L) { __size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, authId) }
      if (body != com.google.protobuf.ByteString.EMPTY) { __size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, body) }
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = authId
        if (__v != 0L) {
          output.writeInt64(1, __v)
        }
      };
      {
        val __v = body
        if (__v != com.google.protobuf.ByteString.EMPTY) {
          output.writeBytes(2, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): im.actor.server.model.MasterKey = {
      var __authId = this.authId
      var __body = this.body
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __authId = __input.readInt64()
          case 18 =>
            __body = __input.readBytes()
          case tag => __input.skipField(tag)
        }
      }
      im.actor.server.model.MasterKey(
          authId = __authId,
          body = __body
      )
    }
    def withAuthId(__v: Long): MasterKey = copy(authId = __v)
    def withBody(__v: com.google.protobuf.ByteString): MasterKey = copy(body = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = authId
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = body
          if (__t != com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = im.actor.server.model.MasterKey
}

object MasterKey extends com.trueaccord.scalapb.GeneratedMessageCompanion[MasterKey]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[MasterKey]  = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): im.actor.server.model.MasterKey = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    im.actor.server.model.MasterKey(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long],
      __fieldsMap.getOrElse(__fields.get(1), com.google.protobuf.ByteString.EMPTY).asInstanceOf[com.google.protobuf.ByteString]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = ModelProto.descriptor.getMessageTypes.get(9)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = im.actor.server.model.MasterKey(
  )
  implicit class MasterKeyLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, MasterKey]) extends com.trueaccord.lenses.ObjectLens[UpperPB, MasterKey](_l) {
    def authId: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.authId)((c_, f_) => c_.copy(authId = f_))
    def body: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.ByteString] = field(_.body)((c_, f_) => c_.copy(body = f_))
  }
  final val AUTH_ID_FIELD_NUMBER = 1
  final val BODY_FIELD_NUMBER = 2
}
