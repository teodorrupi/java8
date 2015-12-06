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
 * The third programming concept that "Java 8 in action" introduces as
 * part of the new features that java 8 has implemented is "parallelism via no-shared-mutable-data".
 *
 * This concept affects the way the behaviour methods that will be passed to Streams API methods. These
 * behaviour methods should be "safe to execute concurrently on different pieces on input." Although is possible
 * to use "synchronized" for the shared mutable data, this goes against the idea of parallelism.
 *
 * The no-shared-mutable-data requirement means that a method can be described only by the way it transforms
 * arguments to results, without any side effects, or like a Mathematical Function.
 *
 * The "no-shared-mutable-data" rule and the ability to "pass methods and functions ("code") to other methods" are
 * the cornerstones of the Functional Programming paradigm.
 */

package com.hl.java8;

/**
 * Created by trupi on 06/12/15.
 */
public class ParallelismExample {
}
