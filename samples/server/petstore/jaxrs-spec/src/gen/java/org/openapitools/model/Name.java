package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Model for testing model name same as property name
 **/
@ApiModel(description = "Model for testing model name same as property name")
@JsonTypeName("Name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class Name  implements Serializable {
  private Integer name;
  private Integer snakeCase;
  private String property;
  private Integer _123number;

  protected Name(NameBuilder<?, ?> b) {
    this.name = b.name;
    this.snakeCase = b.snakeCase;
    this.property = b.property;
    this._123number = b._123number;
  }

  public Name() {
  }

  @JsonCreator
  public Name(
    @JsonProperty(required = true, value = "name") Integer name
  ) {
    this.name = name;
  }

  /**
   **/
  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull public Integer getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(Integer name) {
    this.name = name;
  }

  /**
   **/
  public Name snakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("snake_case")
  public Integer getSnakeCase() {
    return snakeCase;
  }

  @JsonProperty("snake_case")
  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  /**
   **/
  public Name property(String property) {
    this.property = property;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  @JsonProperty("property")
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   **/
  public Name _123number(Integer _123number) {
    this._123number = _123number;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("123Number")
  public Integer get123number() {
    return _123number;
  }

  @JsonProperty("123Number")
  public void set123number(Integer _123number) {
    this._123number = _123number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static NameBuilder<?, ?> builder() {
    return new NameBuilderImpl();
  }

  private static final class NameBuilderImpl extends NameBuilder<Name, NameBuilderImpl> {

    @Override
    protected NameBuilderImpl self() {
      return this;
    }

    @Override
    public Name build() {
      return new Name(this);
    }
  }

  public static abstract class NameBuilder<C extends Name, B extends NameBuilder<C, B>>  {
    private Integer name;
    private Integer snakeCase;
    private String property;
    private Integer _123number;
    protected abstract B self();

    public abstract C build();

    public B name(Integer name) {
      this.name = name;
      return self();
    }
    public B snakeCase(Integer snakeCase) {
      this.snakeCase = snakeCase;
      return self();
    }
    public B property(String property) {
      this.property = property;
      return self();
    }
    public B _123number(Integer _123number) {
      this._123number = _123number;
      return self();
    }
  }
}

