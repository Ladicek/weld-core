/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.test.util.annotated;

import java.lang.reflect.Constructor;
import java.util.Map;

import jakarta.enterprise.inject.spi.AnnotatedConstructor;

/**
 * @author Stuart Douglas
 */
class TestAnnotatedConstructor<X> extends AbstractTestAnnotatedCallable<X, Constructor<X>> implements AnnotatedConstructor<X> {

    TestAnnotatedConstructor(TestAnnotatedType<X> type, Constructor<?> constructor, TestAnnotationStore annotations,
            Map<Integer, TestAnnotationStore> parameterAnnotations) {
        super(type, (Constructor<X>) constructor, constructor.getDeclaringClass(), constructor.getParameterTypes(), annotations,
                parameterAnnotations);
    }

}
