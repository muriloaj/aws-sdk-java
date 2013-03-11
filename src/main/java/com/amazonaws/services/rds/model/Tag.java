/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;
import java.io.Serializable;

/**
 * <p>
 * Metadata assigned to a DB Instance consisting of a key-value pair.
 * </p>
 */
public class Tag  implements Serializable  {

    /**
     * A key is the required name of the tag. The string value can be from 1
     * to 128 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    private String key;

    /**
     * A value is the optional value of the tag. The string value can be from
     * 1 to 256 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    private String value;

    /**
     * A key is the required name of the tag. The string value can be from 1
     * to 128 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @return A key is the required name of the tag. The string value can be from 1
     *         to 128 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    public String getKey() {
        return key;
    }
    
    /**
     * A key is the required name of the tag. The string value can be from 1
     * to 128 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @param key A key is the required name of the tag. The string value can be from 1
     *         to 128 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * A key is the required name of the tag. The string value can be from 1
     * to 128 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A key is the required name of the tag. The string value can be from 1
     *         to 128 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * A value is the optional value of the tag. The string value can be from
     * 1 to 256 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @return A value is the optional value of the tag. The string value can be from
     *         1 to 256 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    public String getValue() {
        return value;
    }
    
    /**
     * A value is the optional value of the tag. The string value can be from
     * 1 to 256 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @param value A value is the optional value of the tag. The string value can be from
     *         1 to 256 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * A value is the optional value of the tag. The string value can be from
     * 1 to 256 Unicode characters in length and cannot be prefixed with
     * "aws:". The string may only contain only the set of Unicode letters,
     * digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     * "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value A value is the optional value of the tag. The string value can be from
     *         1 to 256 Unicode characters in length and cannot be prefixed with
     *         "aws:". The string may only contain only the set of Unicode letters,
     *         digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Tag withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null) sb.append("Key: " + getKey() + ", ");
        if (getValue() != null) sb.append("Value: " + getValue() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Tag == false) return false;
        Tag other = (Tag)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    