/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.huaweicloud.cs.java.v1.model.JobExecutePlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobExecutePlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-29T16:43:47.858+08:00")
public class JobExecutePlanResponse {
  @SerializedName("message_id")
  private String messageId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("current_time")
  private Long currentTime = null;

  @SerializedName("payload")
  private JobExecutePlan payload = null;

  public JobExecutePlanResponse messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * 消息类型ID
   * @return messageId
  **/
  @ApiModelProperty(example = "CS.10001", value = "消息类型ID")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public JobExecutePlanResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 消息内容
   * @return message
  **/
  @ApiModelProperty(example = "消息内容", value = "消息内容")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public JobExecutePlanResponse currentTime(Long currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * 当前时间, 毫秒数
   * @return currentTime
  **/
  @ApiModelProperty(example = "3423423423", value = "当前时间, 毫秒数")
  public Long getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(Long currentTime) {
    this.currentTime = currentTime;
  }

  public JobExecutePlanResponse payload(JobExecutePlan payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public JobExecutePlan getPayload() {
    return payload;
  }

  public void setPayload(JobExecutePlan payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobExecutePlanResponse jobExecutePlanResponse = (JobExecutePlanResponse) o;
    return Objects.equals(this.messageId, jobExecutePlanResponse.messageId) &&
        Objects.equals(this.message, jobExecutePlanResponse.message) &&
        Objects.equals(this.currentTime, jobExecutePlanResponse.currentTime) &&
        Objects.equals(this.payload, jobExecutePlanResponse.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, message, currentTime, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobExecutePlanResponse {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

