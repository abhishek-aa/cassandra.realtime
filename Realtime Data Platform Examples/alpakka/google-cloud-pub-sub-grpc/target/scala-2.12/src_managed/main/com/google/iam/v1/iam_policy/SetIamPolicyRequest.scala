// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.iam.v1.iam_policy

/** Request message for `SetIamPolicy` method.
  *
  * @param resource
  *   REQUIRED: The resource for which the policy is being specified.
  *   `resource` is usually specified as a path. For example, a Project
  *   resource is specified as `projects/{project}`.
  * @param policy
  *   REQUIRED: The complete policy to be applied to the `resource`. The size of
  *   the policy is limited to a few 10s of KB. An empty policy is a
  *   valid policy but certain Cloud Platform services (such as Projects)
  *   might reject them.
  */
@SerialVersionUID(0L)
final case class SetIamPolicyRequest(
    resource: _root_.scala.Predef.String = "",
    policy: _root_.scala.Option[com.google.iam.v1.policy.Policy] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[SetIamPolicyRequest] with scalapb.lenses.Updatable[SetIamPolicyRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = resource
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (policy.isDefined) {
        val __value = policy.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
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
        val __v = resource
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      policy.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.iam.v1.iam_policy.SetIamPolicyRequest = {
      var __resource = this.resource
      var __policy = this.policy
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __resource = _input__.readString()
          case 18 =>
            __policy = Option(_root_.scalapb.LiteParser.readMessage(_input__, __policy.getOrElse(com.google.iam.v1.policy.Policy.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.iam.v1.iam_policy.SetIamPolicyRequest(
          resource = __resource,
          policy = __policy
      )
    }
    def withResource(__v: _root_.scala.Predef.String): SetIamPolicyRequest = copy(resource = __v)
    def getPolicy: com.google.iam.v1.policy.Policy = policy.getOrElse(com.google.iam.v1.policy.Policy.defaultInstance)
    def clearPolicy: SetIamPolicyRequest = copy(policy = None)
    def withPolicy(__v: com.google.iam.v1.policy.Policy): SetIamPolicyRequest = copy(policy = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = resource
          if (__t != "") __t else null
        }
        case 2 => policy.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(resource)
        case 2 => policy.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.iam.v1.iam_policy.SetIamPolicyRequest
}

object SetIamPolicyRequest extends scalapb.GeneratedMessageCompanion[com.google.iam.v1.iam_policy.SetIamPolicyRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.iam.v1.iam_policy.SetIamPolicyRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.iam.v1.iam_policy.SetIamPolicyRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.iam.v1.iam_policy.SetIamPolicyRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.iam.v1.policy.Policy]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.iam.v1.iam_policy.SetIamPolicyRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.iam.v1.iam_policy.SetIamPolicyRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.iam.v1.policy.Policy]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = IamPolicyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = IamPolicyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.iam.v1.policy.Policy
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.iam.v1.iam_policy.SetIamPolicyRequest(
  )
  implicit class SetIamPolicyRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.iam_policy.SetIamPolicyRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.iam.v1.iam_policy.SetIamPolicyRequest](_l) {
    def resource: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.resource)((c_, f_) => c_.copy(resource = f_))
    def policy: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.policy.Policy] = field(_.getPolicy)((c_, f_) => c_.copy(policy = Option(f_)))
    def optionalPolicy: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.iam.v1.policy.Policy]] = field(_.policy)((c_, f_) => c_.copy(policy = f_))
  }
  final val RESOURCE_FIELD_NUMBER = 1
  final val POLICY_FIELD_NUMBER = 2
  def of(
    resource: _root_.scala.Predef.String,
    policy: _root_.scala.Option[com.google.iam.v1.policy.Policy]
  ): _root_.com.google.iam.v1.iam_policy.SetIamPolicyRequest = _root_.com.google.iam.v1.iam_policy.SetIamPolicyRequest(
    resource,
    policy
  )
}