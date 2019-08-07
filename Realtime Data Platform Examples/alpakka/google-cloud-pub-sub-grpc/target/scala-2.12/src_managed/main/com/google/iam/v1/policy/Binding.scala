// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.iam.v1.policy

/** Associates `members` with a `role`.
  *
  * @param role
  *   Role that is assigned to `members`.
  *   For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
  *   Required
  * @param members
  *   Specifies the identities requesting access for a Cloud Platform resource.
  *   `members` can have the following values:
  *  
  *   * `allUsers`: A special identifier that represents anyone who is
  *      on the internet; with or without a Google account.
  *  
  *   * `allAuthenticatedUsers`: A special identifier that represents anyone
  *      who is authenticated with a Google account or a service account.
  *  
  *   * `user:{emailid}`: An email address that represents a specific Google
  *      account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
  *  
  *  
  *   * `serviceAccount:{emailid}`: An email address that represents a service
  *      account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
  *  
  *   * `group:{emailid}`: An email address that represents a Google group.
  *      For example, `admins&#64;example.com`.
  *  
  *   * `domain:{domain}`: A Google Apps domain name that represents all the
  *      users of that domain. For example, `google.com` or `example.com`.
  */
@SerialVersionUID(0L)
final case class Binding(
    role: _root_.scala.Predef.String = "",
    members: _root_.scala.collection.Seq[_root_.scala.Predef.String] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Binding] with scalapb.lenses.Updatable[Binding] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = role
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      members.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = role
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      members.foreach { __v =>
        val __m = __v
        _output__.writeString(2, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.iam.v1.policy.Binding = {
      var __role = this.role
      val __members = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.members)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __role = _input__.readString()
          case 18 =>
            __members += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.iam.v1.policy.Binding(
          role = __role,
          members = __members.result()
      )
    }
    def withRole(__v: _root_.scala.Predef.String): Binding = copy(role = __v)
    def clearMembers = copy(members = _root_.scala.collection.Seq.empty)
    def addMembers(__vs: _root_.scala.Predef.String*): Binding = addAllMembers(__vs)
    def addAllMembers(__vs: TraversableOnce[_root_.scala.Predef.String]): Binding = copy(members = members ++ __vs)
    def withMembers(__v: _root_.scala.collection.Seq[_root_.scala.Predef.String]): Binding = copy(members = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = role
          if (__t != "") __t else null
        }
        case 2 => members
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(role)
        case 2 => _root_.scalapb.descriptors.PRepeated(members.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.iam.v1.policy.Binding
}

object Binding extends scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.Binding] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.Binding] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.iam.v1.policy.Binding = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.iam.v1.policy.Binding(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Predef.String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.iam.v1.policy.Binding] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.iam.v1.policy.Binding(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PolicyProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PolicyProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.iam.v1.policy.Binding(
  )
  implicit class BindingLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.policy.Binding]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.iam.v1.policy.Binding](_l) {
    def role: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.role)((c_, f_) => c_.copy(role = f_))
    def members: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Predef.String]] = field(_.members)((c_, f_) => c_.copy(members = f_))
  }
  final val ROLE_FIELD_NUMBER = 1
  final val MEMBERS_FIELD_NUMBER = 2
  def of(
    role: _root_.scala.Predef.String,
    members: _root_.scala.collection.Seq[_root_.scala.Predef.String]
  ): _root_.com.google.iam.v1.policy.Binding = _root_.com.google.iam.v1.policy.Binding(
    role,
    members
  )
}