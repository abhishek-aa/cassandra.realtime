// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

public interface EnumOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Enum)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  java.util.List<com.google.protobuf.EnumValue> 
      getEnumvalueList();
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  com.google.protobuf.EnumValue getEnumvalue(int index);
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  int getEnumvalueCount();
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.EnumValueOrBuilder> 
      getEnumvalueOrBuilderList();
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  com.google.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(
      int index);

  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  boolean hasSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  com.google.protobuf.SourceContext getSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  com.google.protobuf.SourceContextOrBuilder getSourceContextOrBuilder();

  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   */
  com.google.protobuf.Syntax getSyntax();
}