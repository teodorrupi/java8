/*
 * Copyright (C) 2015 Humanoid Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Not at all a new concept, but relevant to know about when trying to
 * understand java8, is the keyword "static", especially used for static methods.
 *
 * In OOP, static methods are those methods which do not need a new instance of
 * a class instantiated in order to be used. These methods are usable in the object
 * context or without an object.
 *
 * StackOverflow (http://stackoverflow.com/questions/2671496/java-when-to-use-static-methods)
 * So in a class Car you might have a method double convertMpgToKpl(double mpg) which would be
 * static, because one might want to know what 35mpg converts to, even if nobody has ever built a Car.
 * But void setMileage(double mpg) (which sets the efficiency of one particular Car) can't be
 * static since it's inconceivable to call the method before any Car has been constructed.
 *
 * Also, usually static methods are useful for Util classes, where you dont need a new
 * object, but only the method behaviour.
 *
 * IMPORTANT
 * Very useful when you need variables that are common to all objects. This is accomplished
 * with the static modifier on the variable level.
 * Eg:  public class Bicycle { private static int numberOfBicycles = 0; }
 *      Bicycle.numberOfBicycles (CAN be called without instantiating an object)
 */

package com.hl.java8;

/**
 * Created by trupi on 06/12/15.
 */
public class StaticMethodsExample {

    private int id;
    private static int staticVariable = 0;

    public StaticMethodsExample(int id){
        this.id = id;
        staticVariable++;
    }

    public static int getStaticVariable() {
        return staticVariable;
    }
}
