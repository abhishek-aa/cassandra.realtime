// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.system_parameter

/** Define a system parameter rule mapping system parameter definitions to
  * methods.
  *
  * @param selector
  *   Selects the methods to which this rule applies. Use '*' to indicate all
  *   methods in all APIs.
  *  
  *   Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
  * @param parameters
  *   Define parameters. Multiple names may be defined for a parameter.
  *   For a given method call, only one of them should be used. If multiple
  *   names are used the behavior is implementation-dependent.
  *   If none of the specified names are present the behavior is
  *   parameter-dependent.
  */
@SerialVersionUID(0L)
final case class SystemParameterRule(
    selector: _root_.scala.Predef.String = "",
    parameters: _root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[SystemParameterRule] with scalapb.lenses.Updatable[SystemParameterRule] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = selector
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      parameters.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
        val __v = selector
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      parameters.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.system_parameter.SystemParameterRule = {
      var __selector = this.selector
      val __parameters = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.system_parameter.SystemParameter] ++= this.parameters)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __selector = _input__.readString()
          case 18 =>
            __parameters += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.system_parameter.SystemParameter.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.system_parameter.SystemParameterRule(
          selector = __selector,
          parameters = __parameters.result()
      )
    }
    def withSelector(__v: _root_.scala.Predef.String): SystemParameterRule = copy(selector = __v)
    def clearParameters = copy(parameters = _root_.scala.collection.Seq.empty)
    def addParameters(__vs: com.google.api.system_parameter.SystemParameter*): SystemParameterRule = addAllParameters(__vs)
    def addAllParameters(__vs: TraversableOnce[com.google.api.system_parameter.SystemParameter]): SystemParameterRule = copy(parameters = parameters ++ __vs)
    def withParameters(__v: _root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter]): SystemParameterRule = copy(parameters = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = selector
          if (__t != "") __t else null
        }
        case 2 => parameters
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(selector)
        case 2 => _root_.scalapb.descriptors.PRepeated(parameters.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.system_parameter.SystemParameterRule
}

object SystemParameterRule extends scalapb.GeneratedMessageCompanion[com.google.api.system_parameter.SystemParameterRule] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.system_parameter.SystemParameterRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.system_parameter.SystemParameterRule = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.system_parameter.SystemParameterRule(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.system_parameter.SystemParameterRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.system_parameter.SystemParameterRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SystemParameterProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SystemParameterProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.api.system_parameter.SystemParameter
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.system_parameter.SystemParameterRule(
  )
  implicit class SystemParameterRuleLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.system_parameter.SystemParameterRule]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.system_parameter.SystemParameterRule](_l) {
    def selector: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.selector)((c_, f_) => c_.copy(selector = f_))
    def parameters: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter]] = field(_.parameters)((c_, f_) => c_.copy(parameters = f_))
  }
  final val SELECTOR_FIELD_NUMBER = 1
  final val PARAMETERS_FIELD_NUMBER = 2
  def of(
    selector: _root_.scala.Predef.String,
    parameters: _root_.scala.collection.Seq[com.google.api.system_parameter.SystemParameter]
  ): _root_.com.google.api.system_parameter.SystemParameterRule = _root_.com.google.api.system_parameter.SystemParameterRule(
    selector,
    parameters
  )
}