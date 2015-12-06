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
 * The second programming concept that "Java 8 in action" introduces as
 * part of the new features that java 8 has implemented is "behaviour parameterization".
 *
 * Prior to java 8 you could write a method, for example to compare objects, or a Comparator
 * object when sorting is needed. Java 8 adds the ability to pass a method as argument to
 * another method, so that you can use some piece of behaviour (code).
 *
 * Streams API is also built with the idea that you can parameterize the behaviour of its operations
 * by passing methods.
 * Eg: object.someStreamAction(someMethod).someOtherStreamAction(someOtherMethod)
 */

package com.hl.java8;

/**
 * Created by trupi on 06/12/15.
 */
public class BehaviourParameterizationExample {
}
