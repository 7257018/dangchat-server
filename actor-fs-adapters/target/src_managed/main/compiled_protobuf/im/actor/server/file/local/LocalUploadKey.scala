// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package im.actor.server.file.local



@SerialVersionUID(0L)
final case class LocalUploadKey(
    key: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[LocalUploadKey] with com.trueaccord.lenses.Updatable[LocalUploadKey] with im.actor.server.file.UploadKey {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, key)
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      output.writeString(1, key)
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): im.actor.server.file.local.LocalUploadKey = {
      var __key = this.key
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = __input.readString()
          case tag => __input.skipField(tag)
        }
      }
      im.actor.server.file.local.LocalUploadKey(
          key = __key
      )
    }
    def withKey(__v: String): LocalUploadKey = copy(key = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => key
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = im.actor.server.file.local.LocalUploadKey
}

object LocalUploadKey extends com.trueaccord.scalapb.GeneratedMessageCompanion[LocalUploadKey]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[LocalUploadKey]  = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): im.actor.server.file.local.LocalUploadKey = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    im.actor.server.file.local.LocalUploadKey(
      __fieldsMap(__fields.get(0)).asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = LocalProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = im.actor.server.file.local.LocalUploadKey(
    key = ""
  )
  implicit class LocalUploadKeyLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, LocalUploadKey]) extends com.trueaccord.lenses.ObjectLens[UpperPB, LocalUploadKey](_l) {
    def key: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.key)((c_, f_) => c_.copy(key = f_))
  }
  final val KEY_FIELD_NUMBER = 1
}
