/*
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.truffleruby.platform;

public class Pointer {

    public Pointer(jnr.ffi.Pointer pointer) {
        this.pointer = pointer;
    }

    private final jnr.ffi.Pointer pointer;

    public jnr.ffi.Pointer getPointer() {
        return pointer;
    }

}
