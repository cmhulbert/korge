// WARNING: File autogenerated DO NOT modify
// https://www.khronos.org/registry/OpenGL/api/GLES2/gl2.h
@file:Suppress("unused", "RedundantUnitReturnType", "PropertyName")

package com.soywiz.kgl

import com.soywiz.kmem.*
import kotlinx.cinterop.*
import com.soywiz.korim.bitmap.*
import com.soywiz.korim.format.*
import platform.opengl32.*
import platform.windows.*
import platform.posix.*

actual class KmlGlNative actual constructor() : KmlGl() {
    val tempBufferAddress = TempBufferAddress()
    override fun activeTexture(texture: Int): Unit = tempBufferAddress { glActiveTexture(texture.convert()) }
    override fun attachShader(program: Int, shader: Int): Unit = tempBufferAddress { glAttachShader(program.convert(), shader.convert()) }
    override fun bindAttribLocation(program: Int, index: Int, name: String): Unit = memScoped { tempBufferAddress { glBindAttribLocation(program.convert(), index.convert(), ((name).cstr.getPointer(this@memScoped))) } }
    override fun bindBuffer(target: Int, buffer: Int): Unit = tempBufferAddress { glBindBuffer(target.convert(), buffer.convert()) }
    override fun bindFramebuffer(target: Int, framebuffer: Int): Unit = tempBufferAddress { glBindFramebuffer(target.convert(), framebuffer.convert()) }
    override fun bindRenderbuffer(target: Int, renderbuffer: Int): Unit = tempBufferAddress { glBindRenderbuffer(target.convert(), renderbuffer.convert()) }
    override fun bindTexture(target: Int, texture: Int): Unit = tempBufferAddress { glBindTexture(target.convert(), texture.convert()) }
    override fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = tempBufferAddress { glBlendColor(red, green, blue, alpha) }
    override fun blendEquation(mode: Int): Unit = tempBufferAddress { glBlendEquation(mode.convert()) }
    override fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit = tempBufferAddress { glBlendEquationSeparate(modeRGB.convert(), modeAlpha.convert()) }
    override fun blendFunc(sfactor: Int, dfactor: Int): Unit = tempBufferAddress { glBlendFunc(sfactor.convert(), dfactor.convert()) }
    override fun blendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit = tempBufferAddress { glBlendFuncSeparate(sfactorRGB.convert(), dfactorRGB.convert(), sfactorAlpha.convert(), dfactorAlpha.convert()) }
    override fun bufferData(target: Int, size: Int, data: FBuffer, usage: Int): Unit = tempBufferAddress { glBufferData(target.convert(), size.convert(), data.unsafeAddress().reinterpret(), usage.convert()) }
    override fun bufferSubData(target: Int, offset: Int, size: Int, data: FBuffer): Unit = tempBufferAddress { glBufferSubData(target.convert(), offset.convert(), size.convert(), data.unsafeAddress().reinterpret()) }
    override fun checkFramebufferStatus(target: Int): Int = tempBufferAddress { glCheckFramebufferStatus(target.convert()).convert() }
    override fun clear(mask: Int): Unit = tempBufferAddress { glClear(mask.convert()) }
    override fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit = tempBufferAddress { glClearColor(red, green, blue, alpha) }
    override fun clearDepthf(d: Float): Unit = tempBufferAddress { glClearDepth(d.convertFloat()) }
    override fun clearStencil(s: Int): Unit = tempBufferAddress { glClearStencil(s.convert()) }
    override fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit = tempBufferAddress { glColorMask(red.toInt().convert(), green.toInt().convert(), blue.toInt().convert(), alpha.toInt().convert()) }
    override fun compileShader(shader: Int): Unit = tempBufferAddress { glCompileShader(shader.convert()) }
    override fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: FBuffer): Unit = tempBufferAddress { glCompressedTexImage2D(target.convert(), level.convert(), internalformat.convert(), width.convert(), height.convert(), border.convert(), imageSize.convert(), data.unsafeAddress().reinterpret()) }
    override fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: FBuffer): Unit = tempBufferAddress { glCompressedTexSubImage2D(target.convert(), level.convert(), xoffset.convert(), yoffset.convert(), width.convert(), height.convert(), format.convert(), imageSize.convert(), data.unsafeAddress().reinterpret()) }
    override fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit = tempBufferAddress { glCopyTexImage2D(target.convert(), level.convert(), internalformat.convert(), x.convert(), y.convert(), width.convert(), height.convert(), border.convert()) }
    override fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glCopyTexSubImage2D(target.convert(), level.convert(), xoffset.convert(), yoffset.convert(), x.convert(), y.convert(), width.convert(), height.convert()) }
    override fun createProgram(): Int = tempBufferAddress { glCreateProgram().convert() }
    override fun createShader(type: Int): Int = tempBufferAddress { glCreateShader(type.convert()).convert() }
    override fun cullFace(mode: Int): Unit = tempBufferAddress { glCullFace(mode.convert()) }
    override fun deleteBuffers(n: Int, items: FBuffer): Unit = tempBufferAddress { glDeleteBuffers(n.convert(), items.unsafeAddress().reinterpret()) }
    override fun deleteFramebuffers(n: Int, items: FBuffer): Unit = tempBufferAddress { glDeleteFramebuffers(n.convert(), items.unsafeAddress().reinterpret()) }
    override fun deleteProgram(program: Int): Unit = tempBufferAddress { glDeleteProgram(program.convert()) }
    override fun deleteRenderbuffers(n: Int, items: FBuffer): Unit = tempBufferAddress { glDeleteRenderbuffers(n.convert(), items.unsafeAddress().reinterpret()) }
    override fun deleteShader(shader: Int): Unit = tempBufferAddress { glDeleteShader(shader.convert()) }
    override fun deleteTextures(n: Int, items: FBuffer): Unit = tempBufferAddress { glDeleteTextures(n.convert(), items.unsafeAddress().reinterpret()) }
    override fun depthFunc(func: Int): Unit = tempBufferAddress { glDepthFunc(func.convert()) }
    override fun depthMask(flag: Boolean): Unit = tempBufferAddress { glDepthMask(flag.toInt().convert()) }
    override fun depthRangef(n: Float, f: Float): Unit = tempBufferAddress { glDepthRange(n.convertFloat(), f.convertFloat()) }
    override fun detachShader(program: Int, shader: Int): Unit = tempBufferAddress { glDetachShader(program.convert(), shader.convert()) }
    override fun disable(cap: Int): Unit = tempBufferAddress { glDisable(cap.convert()) }
    override fun disableVertexAttribArray(index: Int): Unit = tempBufferAddress { glDisableVertexAttribArray(index.convert()) }
    override fun drawArrays(mode: Int, first: Int, count: Int): Unit = tempBufferAddress { glDrawArrays(mode.convert(), first.convert(), count.convert()) }
    override fun drawElements(mode: Int, count: Int, type: Int, indices: Int): Unit = tempBufferAddress { glDrawElements(mode.convert(), count.convert(), type.convert(), indices.toLong().toCPointer<IntVar>()) }
    override fun enable(cap: Int): Unit = tempBufferAddress { glEnable(cap.convert()) }
    override fun enableVertexAttribArray(index: Int): Unit = tempBufferAddress { glEnableVertexAttribArray(index.convert()) }
    override fun finish(): Unit = tempBufferAddress { glFinish() }
    override fun flush(): Unit = tempBufferAddress { glFlush() }
    override fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit = tempBufferAddress { glFramebufferRenderbuffer(target.convert(), attachment.convert(), renderbuffertarget.convert(), renderbuffer.convert()) }
    override fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit = tempBufferAddress { glFramebufferTexture2D(target.convert(), attachment.convert(), textarget.convert(), texture.convert(), level.convert()) }
    override fun frontFace(mode: Int): Unit = tempBufferAddress { glFrontFace(mode.convert()) }
    override fun genBuffers(n: Int, buffers: FBuffer): Unit = tempBufferAddress { glGenBuffers(n.convert(), buffers.unsafeAddress().reinterpret()) }
    override fun generateMipmap(target: Int): Unit = tempBufferAddress { glGenerateMipmap(target.convert()) }
    override fun genFramebuffers(n: Int, framebuffers: FBuffer): Unit = tempBufferAddress { glGenFramebuffers(n.convert(), framebuffers.unsafeAddress().reinterpret()) }
    override fun genRenderbuffers(n: Int, renderbuffers: FBuffer): Unit = tempBufferAddress { glGenRenderbuffers(n.convert(), renderbuffers.unsafeAddress().reinterpret()) }
    override fun genTextures(n: Int, textures: FBuffer): Unit = tempBufferAddress { glGenTextures(n.convert(), textures.unsafeAddress().reinterpret()) }
    override fun getActiveAttrib(program: Int, index: Int, bufSize: Int, length: FBuffer, size: FBuffer, type: FBuffer, name: FBuffer): Unit = tempBufferAddress { glGetActiveAttrib(program.convert(), index.convert(), bufSize.convert(), length.unsafeAddress().reinterpret(), size.unsafeAddress().reinterpret(), type.unsafeAddress().reinterpret(), name.unsafeAddress().reinterpret()) }
    override fun getActiveUniform(program: Int, index: Int, bufSize: Int, length: FBuffer, size: FBuffer, type: FBuffer, name: FBuffer): Unit = tempBufferAddress { glGetActiveUniform(program.convert(), index.convert(), bufSize.convert(), length.unsafeAddress().reinterpret(), size.unsafeAddress().reinterpret(), type.unsafeAddress().reinterpret(), name.unsafeAddress().reinterpret()) }
    override fun getAttachedShaders(program: Int, maxCount: Int, count: FBuffer, shaders: FBuffer): Unit = tempBufferAddress { glGetAttachedShaders(program.convert(), maxCount.convert(), count.unsafeAddress().reinterpret(), shaders.unsafeAddress().reinterpret()) }
    override fun getAttribLocation(program: Int, name: String): Int = memScoped { tempBufferAddress { glGetAttribLocation(program.convert(), ((name).cstr.getPointer(this@memScoped))).convert() } }
    override fun getUniformLocation(program: Int, name: String): Int = memScoped { tempBufferAddress { glGetUniformLocation(program.convert(), ((name).cstr.getPointer(this@memScoped))).convert() } }
    override fun getBooleanv(pname: Int, data: FBuffer): Unit = tempBufferAddress { glGetBooleanv(pname.convert(), data.unsafeAddress().reinterpret()) }
    override fun getBufferParameteriv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetBufferParameteriv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getError(): Int = tempBufferAddress { glGetError().convert() }
    override fun getFloatv(pname: Int, data: FBuffer): Unit = tempBufferAddress { glGetFloatv(pname.convert(), data.unsafeAddress().reinterpret()) }
    override fun getFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetFramebufferAttachmentParameteriv(target.convert(), attachment.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getIntegerv(pname: Int, data: FBuffer): Unit = tempBufferAddress { glGetIntegerv(pname.convert(), data.unsafeAddress().reinterpret()) }
    override fun getProgramInfoLog(program: Int, bufSize: Int, length: FBuffer, infoLog: FBuffer): Unit = tempBufferAddress { glGetProgramInfoLog(program.convert(), bufSize.convert(), length.unsafeAddress().reinterpret(), infoLog.unsafeAddress().reinterpret()) }
    override fun getRenderbufferParameteriv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetRenderbufferParameteriv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getProgramiv(program: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetProgramiv(program.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getShaderiv(shader: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetShaderiv(shader.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getShaderInfoLog(shader: Int, bufSize: Int, length: FBuffer, infoLog: FBuffer): Unit = tempBufferAddress { glGetShaderInfoLog(shader.convert(), bufSize.convert(), length.unsafeAddress().reinterpret(), infoLog.unsafeAddress().reinterpret()) }
    override fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: FBuffer, precision: FBuffer): Unit = tempBufferAddress { Unit }
    override fun getShaderSource(shader: Int, bufSize: Int, length: FBuffer, source: FBuffer): Unit = tempBufferAddress { glGetShaderSource(shader.convert(), bufSize.convert(), length.unsafeAddress().reinterpret(), source.unsafeAddress().reinterpret()) }
    override fun getString(name: Int): String = tempBufferAddress { ((glGetString(name.convert()))?.toKString() ?: "") }
    override fun getTexParameterfv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetTexParameterfv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getTexParameteriv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetTexParameteriv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getUniformfv(program: Int, location: Int, params: FBuffer): Unit = tempBufferAddress { glGetUniformfv(program.convert(), location.convert(), params.unsafeAddress().reinterpret()) }
    override fun getUniformiv(program: Int, location: Int, params: FBuffer): Unit = tempBufferAddress { glGetUniformiv(program.convert(), location.convert(), params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribfv(index: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetVertexAttribfv(index.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribiv(index: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glGetVertexAttribiv(index.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun getVertexAttribPointerv(index: Int, pname: Int, pointer: FBuffer): Unit = tempBufferAddress { glGetVertexAttribPointerv(index.convert(), pname.convert(), pointer.unsafeAddress().reinterpret()) }
    override fun hint(target: Int, mode: Int): Unit = tempBufferAddress { glHint(target.convert(), mode.convert()) }
    override fun isBuffer(buffer: Int): Boolean = tempBufferAddress { glIsBuffer(buffer.convert()).toBool() }
    override fun isEnabled(cap: Int): Boolean = tempBufferAddress { glIsEnabled(cap.convert()).toBool() }
    override fun isFramebuffer(framebuffer: Int): Boolean = tempBufferAddress { glIsFramebuffer(framebuffer.convert()).toBool() }
    override fun isProgram(program: Int): Boolean = tempBufferAddress { glIsProgram(program.convert()).toBool() }
    override fun isRenderbuffer(renderbuffer: Int): Boolean = tempBufferAddress { glIsRenderbuffer(renderbuffer.convert()).toBool() }
    override fun isShader(shader: Int): Boolean = tempBufferAddress { glIsShader(shader.convert()).toBool() }
    override fun isTexture(texture: Int): Boolean = tempBufferAddress { glIsTexture(texture.convert()).toBool() }
    override fun lineWidth(width: Float): Unit = tempBufferAddress { glLineWidth(width) }
    override fun linkProgram(program: Int): Unit = tempBufferAddress { glLinkProgram(program.convert()) }
    override fun pixelStorei(pname: Int, param: Int): Unit = tempBufferAddress { glPixelStorei(pname.convert(), param.convert()) }
    override fun polygonOffset(factor: Float, units: Float): Unit = tempBufferAddress { glPolygonOffset(factor, units) }
    override fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: FBuffer): Unit = tempBufferAddress { glReadPixels(x.convert(), y.convert(), width.convert(), height.convert(), format.convert(), type.convert(), pixels.unsafeAddress()) }
    override fun releaseShaderCompiler(): Unit = tempBufferAddress { Unit }
    override fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit = tempBufferAddress { glRenderbufferStorage(target.convert(), internalformat.convert(), width.convert(), height.convert()) }
    override fun sampleCoverage(value: Float, invert: Boolean): Unit = tempBufferAddress { glSampleCoverage(value, invert.toInt().convert()) }
    override fun scissor(x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glScissor(x.convert(), y.convert(), width.convert(), height.convert()) }
    override fun shaderBinary(count: Int, shaders: FBuffer, binaryformat: Int, binary: FBuffer, length: Int): Unit = tempBufferAddress { throw KmlGlException("shaderBinary not implemented in Native") }
    override fun shaderSource(shader: Int, string: String): Unit = memScoped { tempBufferAddress { run {
                memScoped {
                    val lengths = allocArray<IntVar>(1)
                    val strings = allocArray<CPointerVar<ByteVar>>(1)
                    lengths[0] = strlen(string).convert()
                    strings[0] = string.cstr.placeTo(this)
                    glShaderSource(shader.convert(), 1.convert(), strings.reinterpret(), lengths.reinterpret())
                }
                } } }
    override fun stencilFunc(func: Int, ref: Int, mask: Int): Unit = tempBufferAddress { glStencilFunc(func.convert(), ref.convert(), mask.convert()) }
    override fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit = tempBufferAddress { glStencilFuncSeparate(face.convert(), func.convert(), ref.convert(), mask.convert()) }
    override fun stencilMask(mask: Int): Unit = tempBufferAddress { glStencilMask(mask.convert()) }
    override fun stencilMaskSeparate(face: Int, mask: Int): Unit = tempBufferAddress { glStencilMaskSeparate(face.convert(), mask.convert()) }
    override fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit = tempBufferAddress { glStencilOp(fail.convert(), zfail.convert(), zpass.convert()) }
    override fun stencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit = tempBufferAddress { glStencilOpSeparate(face.convert(), sfail.convert(), dpfail.convert(), dppass.convert()) }
    override fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: FBuffer?): Unit = tempBufferAddress { glTexImage2D(target.convert(), level.convert(), internalformat.convert(), width.convert(), height.convert(), border.convert(), format.convert(), type.convert(), pixels?.unsafeAddress()) }
    override fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, data: NativeImage): Unit = tempBufferAddress { run { val intData = (data as BitmapNativeImage).intData; if (intData != null) {	intData.usePinned { dataPin -> glTexImage2D(target.convert(), level.convert(), internalformat.convert(), data.width.convert(), data.height.convert(), 0.convert(), format.convert(), type.convert(), dataPin.addressOf(0)) }} else {	glTexImage2D(target.convert(), level.convert(), internalformat.convert(), data.width.convert(), data.height.convert(), 0.convert(), format.convert(), type.convert(), null)}} }
    override fun texParameterf(target: Int, pname: Int, param: Float): Unit = tempBufferAddress { glTexParameterf(target.convert(), pname.convert(), param) }
    override fun texParameterfv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glTexParameterfv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun texParameteri(target: Int, pname: Int, param: Int): Unit = tempBufferAddress { glTexParameteri(target.convert(), pname.convert(), param.convert()) }
    override fun texParameteriv(target: Int, pname: Int, params: FBuffer): Unit = tempBufferAddress { glTexParameteriv(target.convert(), pname.convert(), params.unsafeAddress().reinterpret()) }
    override fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: FBuffer): Unit = tempBufferAddress { glTexSubImage2D(target.convert(), level.convert(), xoffset.convert(), yoffset.convert(), width.convert(), height.convert(), format.convert(), type.convert(), pixels.unsafeAddress()) }
    override fun uniform1f(location: Int, v0: Float): Unit = tempBufferAddress { glUniform1f(location.convert(), v0) }
    override fun uniform1fv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform1fv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform1i(location: Int, v0: Int): Unit = tempBufferAddress { glUniform1i(location.convert(), v0.convert()) }
    override fun uniform1iv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform1iv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform2f(location: Int, v0: Float, v1: Float): Unit = tempBufferAddress { glUniform2f(location.convert(), v0, v1) }
    override fun uniform2fv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform2fv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform2i(location: Int, v0: Int, v1: Int): Unit = tempBufferAddress { glUniform2i(location.convert(), v0.convert(), v1.convert()) }
    override fun uniform2iv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform2iv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit = tempBufferAddress { glUniform3f(location.convert(), v0, v1, v2) }
    override fun uniform3fv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform3fv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit = tempBufferAddress { glUniform3i(location.convert(), v0.convert(), v1.convert(), v2.convert()) }
    override fun uniform3iv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform3iv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit = tempBufferAddress { glUniform4f(location.convert(), v0, v1, v2, v3) }
    override fun uniform4fv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform4fv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = tempBufferAddress { glUniform4i(location.convert(), v0.convert(), v1.convert(), v2.convert(), v3.convert()) }
    override fun uniform4iv(location: Int, count: Int, value: FBuffer): Unit = tempBufferAddress { glUniform4iv(location.convert(), count.convert(), value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix2fv(location: Int, count: Int, transpose: Boolean, value: FBuffer): Unit = tempBufferAddress { glUniformMatrix2fv(location.convert(), count.convert(), transpose.toInt().convert(), value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix3fv(location: Int, count: Int, transpose: Boolean, value: FBuffer): Unit = tempBufferAddress { glUniformMatrix3fv(location.convert(), count.convert(), transpose.toInt().convert(), value.unsafeAddress().reinterpret()) }
    override fun uniformMatrix4fv(location: Int, count: Int, transpose: Boolean, value: FBuffer): Unit = tempBufferAddress { glUniformMatrix4fv(location.convert(), count.convert(), transpose.toInt().convert(), value.unsafeAddress().reinterpret()) }
    override fun useProgram(program: Int): Unit = tempBufferAddress { glUseProgram(program.convert()) }
    override fun validateProgram(program: Int): Unit = tempBufferAddress { glValidateProgram(program.convert()) }
    override fun vertexAttrib1f(index: Int, x: Float): Unit = tempBufferAddress { glVertexAttrib1f(index.convert(), x) }
    override fun vertexAttrib1fv(index: Int, v: FBuffer): Unit = tempBufferAddress { glVertexAttrib1fv(index.convert(), v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit = tempBufferAddress { glVertexAttrib2f(index.convert(), x, y) }
    override fun vertexAttrib2fv(index: Int, v: FBuffer): Unit = tempBufferAddress { glVertexAttrib2fv(index.convert(), v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit = tempBufferAddress { glVertexAttrib3f(index.convert(), x, y, z) }
    override fun vertexAttrib3fv(index: Int, v: FBuffer): Unit = tempBufferAddress { glVertexAttrib3fv(index.convert(), v.unsafeAddress().reinterpret()) }
    override fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit = tempBufferAddress { glVertexAttrib4f(index.convert(), x, y, z, w) }
    override fun vertexAttrib4fv(index: Int, v: FBuffer): Unit = tempBufferAddress { glVertexAttrib4fv(index.convert(), v.unsafeAddress().reinterpret()) }
    override fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, pointer: Long): Unit = tempBufferAddress { glVertexAttribPointer(index.convert(), size.convert(), type.convert(), normalized.toInt().convert(), stride.convert(), pointer.toCPointer<IntVar>()) }
    override fun viewport(x: Int, y: Int, width: Int, height: Int): Unit = tempBufferAddress { glViewport(x.convert(), y.convert(), width.convert(), height.convert()) }

	companion object {
        private fun <T : CPointer<*>> CPointer<*>?.reinterpret2(): T = this.toLong().toCPointer<IntVar>() as T

        val glActiveTexture: PFNGLACTIVETEXTUREPROC by lazy { wglGetProcAddressAny("glActiveTexture").reinterpret2<PFNGLACTIVETEXTUREPROC>() }
		val glAttachShader: PFNGLATTACHSHADERPROC by lazy { wglGetProcAddressAny("glAttachShader").reinterpret2<PFNGLATTACHSHADERPROC>() }
		val glBindAttribLocation: PFNGLBINDATTRIBLOCATIONPROC by lazy { wglGetProcAddressAny("glBindAttribLocation").reinterpret2<PFNGLBINDATTRIBLOCATIONPROC>() }
		val glBindBuffer: PFNGLBINDBUFFERPROC by lazy { wglGetProcAddressAny("glBindBuffer").reinterpret2<PFNGLBINDBUFFERPROC>() }
		val glBindFramebuffer: PFNGLBINDFRAMEBUFFERPROC by lazy { wglGetProcAddressAny("glBindFramebuffer").reinterpret2<PFNGLBINDFRAMEBUFFERPROC>() }
		val glBindRenderbuffer: PFNGLBINDRENDERBUFFERPROC by lazy { wglGetProcAddressAny("glBindRenderbuffer").reinterpret2<PFNGLBINDRENDERBUFFERPROC>() }
		val glBlendColor: PFNGLBLENDCOLORPROC by lazy { wglGetProcAddressAny("glBlendColor").reinterpret2<PFNGLBLENDCOLORPROC>() }
		val glBlendEquation: PFNGLBLENDEQUATIONPROC by lazy { wglGetProcAddressAny("glBlendEquation").reinterpret2<PFNGLBLENDEQUATIONPROC>() }
		val glBlendEquationSeparate: PFNGLBLENDEQUATIONSEPARATEPROC by lazy { wglGetProcAddressAny("glBlendEquationSeparate").reinterpret2<PFNGLBLENDEQUATIONSEPARATEPROC>() }
		val glBlendFuncSeparate: PFNGLBLENDFUNCSEPARATEPROC by lazy { wglGetProcAddressAny("glBlendFuncSeparate").reinterpret2<PFNGLBLENDFUNCSEPARATEPROC>() }
		val glBufferData: PFNGLBUFFERDATAPROC by lazy { wglGetProcAddressAny("glBufferData").reinterpret2<PFNGLBUFFERDATAPROC>() }
		val glBufferSubData: PFNGLBUFFERSUBDATAPROC by lazy { wglGetProcAddressAny("glBufferSubData").reinterpret2<PFNGLBUFFERSUBDATAPROC>() }
		val glCheckFramebufferStatus: PFNGLCHECKFRAMEBUFFERSTATUSPROC by lazy { wglGetProcAddressAny("glCheckFramebufferStatus").reinterpret2<PFNGLCHECKFRAMEBUFFERSTATUSPROC>() }
		val glCompileShader: PFNGLCOMPILESHADERPROC by lazy { wglGetProcAddressAny("glCompileShader").reinterpret2<PFNGLCOMPILESHADERPROC>() }
		val glCompressedTexImage2D: PFNGLCOMPRESSEDTEXIMAGE2DPROC by lazy { wglGetProcAddressAny("glCompressedTexImage2D").reinterpret2<PFNGLCOMPRESSEDTEXIMAGE2DPROC>() }
		val glCompressedTexSubImage2D: PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC by lazy { wglGetProcAddressAny("glCompressedTexSubImage2D").reinterpret2<PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC>() }
		val glCreateProgram: PFNGLCREATEPROGRAMPROC by lazy { wglGetProcAddressAny("glCreateProgram").reinterpret2<PFNGLCREATEPROGRAMPROC>() }
		val glCreateShader: PFNGLCREATESHADERPROC by lazy { wglGetProcAddressAny("glCreateShader").reinterpret2<PFNGLCREATESHADERPROC>() }
		val glDeleteBuffers: PFNGLDELETEBUFFERSPROC by lazy { wglGetProcAddressAny("glDeleteBuffers").reinterpret2<PFNGLDELETEBUFFERSPROC>() }
		val glDeleteFramebuffers: PFNGLDELETEFRAMEBUFFERSPROC by lazy { wglGetProcAddressAny("glDeleteFramebuffers").reinterpret2<PFNGLDELETEFRAMEBUFFERSPROC>() }
		val glDeleteProgram: PFNGLDELETEPROGRAMPROC by lazy { wglGetProcAddressAny("glDeleteProgram").reinterpret2<PFNGLDELETEPROGRAMPROC>() }
		val glDeleteRenderbuffers: PFNGLDELETERENDERBUFFERSPROC by lazy { wglGetProcAddressAny("glDeleteRenderbuffers").reinterpret2<PFNGLDELETERENDERBUFFERSPROC>() }
		val glDeleteShader: PFNGLDELETESHADERPROC by lazy { wglGetProcAddressAny("glDeleteShader").reinterpret2<PFNGLDELETESHADERPROC>() }
		val glDetachShader: PFNGLDETACHSHADERPROC by lazy { wglGetProcAddressAny("glDetachShader").reinterpret2<PFNGLDETACHSHADERPROC>() }
		val glDisableVertexAttribArray: PFNGLDISABLEVERTEXATTRIBARRAYPROC by lazy { wglGetProcAddressAny("glDisableVertexAttribArray").reinterpret2<PFNGLDISABLEVERTEXATTRIBARRAYPROC>() }
		val glEnableVertexAttribArray: PFNGLENABLEVERTEXATTRIBARRAYPROC by lazy { wglGetProcAddressAny("glEnableVertexAttribArray").reinterpret2<PFNGLENABLEVERTEXATTRIBARRAYPROC>() }
		val glFramebufferRenderbuffer: PFNGLFRAMEBUFFERRENDERBUFFERPROC by lazy { wglGetProcAddressAny("glFramebufferRenderbuffer").reinterpret2<PFNGLFRAMEBUFFERRENDERBUFFERPROC>() }
		val glFramebufferTexture2D: PFNGLFRAMEBUFFERTEXTURE2DPROC by lazy { wglGetProcAddressAny("glFramebufferTexture2D").reinterpret2<PFNGLFRAMEBUFFERTEXTURE2DPROC>() }
		val glGenBuffers: PFNGLGENBUFFERSPROC by lazy { wglGetProcAddressAny("glGenBuffers").reinterpret2<PFNGLGENBUFFERSPROC>() }
		val glGenerateMipmap: PFNGLGENERATEMIPMAPPROC by lazy { wglGetProcAddressAny("glGenerateMipmap").reinterpret2<PFNGLGENERATEMIPMAPPROC>() }
		val glGenFramebuffers: PFNGLGENFRAMEBUFFERSPROC by lazy { wglGetProcAddressAny("glGenFramebuffers").reinterpret2<PFNGLGENFRAMEBUFFERSPROC>() }
		val glGenRenderbuffers: PFNGLGENRENDERBUFFERSPROC by lazy { wglGetProcAddressAny("glGenRenderbuffers").reinterpret2<PFNGLGENRENDERBUFFERSPROC>() }
		val glGetActiveAttrib: PFNGLGETACTIVEATTRIBPROC by lazy { wglGetProcAddressAny("glGetActiveAttrib").reinterpret2<PFNGLGETACTIVEATTRIBPROC>() }
		val glGetActiveUniform: PFNGLGETACTIVEUNIFORMPROC by lazy { wglGetProcAddressAny("glGetActiveUniform").reinterpret2<PFNGLGETACTIVEUNIFORMPROC>() }
		val glGetAttachedShaders: PFNGLGETATTACHEDSHADERSPROC by lazy { wglGetProcAddressAny("glGetAttachedShaders").reinterpret2<PFNGLGETATTACHEDSHADERSPROC>() }
		val glGetAttribLocation: PFNGLGETATTRIBLOCATIONPROC by lazy { wglGetProcAddressAny("glGetAttribLocation").reinterpret2<PFNGLGETATTRIBLOCATIONPROC>() }
		val glGetUniformLocation: PFNGLGETUNIFORMLOCATIONPROC by lazy { wglGetProcAddressAny("glGetUniformLocation").reinterpret2<PFNGLGETUNIFORMLOCATIONPROC>() }
		val glGetBufferParameteriv: PFNGLGETBUFFERPARAMETERIVPROC by lazy { wglGetProcAddressAny("glGetBufferParameteriv").reinterpret2<PFNGLGETBUFFERPARAMETERIVPROC>() }
		val glGetFramebufferAttachmentParameteriv: PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC by lazy { wglGetProcAddressAny("glGetFramebufferAttachmentParameteriv").reinterpret2<PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC>() }
		val glGetProgramInfoLog: PFNGLGETPROGRAMINFOLOGPROC by lazy { wglGetProcAddressAny("glGetProgramInfoLog").reinterpret2<PFNGLGETPROGRAMINFOLOGPROC>() }
		val glGetRenderbufferParameteriv: PFNGLGETRENDERBUFFERPARAMETERIVPROC by lazy { wglGetProcAddressAny("glGetRenderbufferParameteriv").reinterpret2<PFNGLGETRENDERBUFFERPARAMETERIVPROC>() }
		val glGetProgramiv: PFNGLGETPROGRAMIVPROC by lazy { wglGetProcAddressAny("glGetProgramiv").reinterpret2<PFNGLGETPROGRAMIVPROC>() }
		val glGetShaderiv: PFNGLGETSHADERIVPROC by lazy { wglGetProcAddressAny("glGetShaderiv").reinterpret2<PFNGLGETSHADERIVPROC>() }
		val glGetShaderInfoLog: PFNGLGETSHADERINFOLOGPROC by lazy { wglGetProcAddressAny("glGetShaderInfoLog").reinterpret2<PFNGLGETSHADERINFOLOGPROC>() }
		val glGetShaderPrecisionFormat: PFNGLGETSHADERPRECISIONFORMATPROC by lazy { wglGetProcAddressAny("glGetShaderPrecisionFormat").reinterpret2<PFNGLGETSHADERPRECISIONFORMATPROC>() }
		val glGetShaderSource: PFNGLGETSHADERSOURCEPROC by lazy { wglGetProcAddressAny("glGetShaderSource").reinterpret2<PFNGLGETSHADERSOURCEPROC>() }
		val glGetUniformfv: PFNGLGETUNIFORMFVPROC by lazy { wglGetProcAddressAny("glGetUniformfv").reinterpret2<PFNGLGETUNIFORMFVPROC>() }
		val glGetUniformiv: PFNGLGETUNIFORMIVPROC by lazy { wglGetProcAddressAny("glGetUniformiv").reinterpret2<PFNGLGETUNIFORMIVPROC>() }
		val glGetVertexAttribfv: PFNGLGETVERTEXATTRIBFVPROC by lazy { wglGetProcAddressAny("glGetVertexAttribfv").reinterpret2<PFNGLGETVERTEXATTRIBFVPROC>() }
		val glGetVertexAttribiv: PFNGLGETVERTEXATTRIBIVPROC by lazy { wglGetProcAddressAny("glGetVertexAttribiv").reinterpret2<PFNGLGETVERTEXATTRIBIVPROC>() }
		val glGetVertexAttribPointerv: PFNGLGETVERTEXATTRIBPOINTERVPROC by lazy { wglGetProcAddressAny("glGetVertexAttribPointerv").reinterpret2<PFNGLGETVERTEXATTRIBPOINTERVPROC>() }
		val glIsBuffer: PFNGLISBUFFERPROC by lazy { wglGetProcAddressAny("glIsBuffer").reinterpret2<PFNGLISBUFFERPROC>() }
		val glIsFramebuffer: PFNGLISFRAMEBUFFERPROC by lazy { wglGetProcAddressAny("glIsFramebuffer").reinterpret2<PFNGLISFRAMEBUFFERPROC>() }
		val glIsProgram: PFNGLISPROGRAMPROC by lazy { wglGetProcAddressAny("glIsProgram").reinterpret2<PFNGLISPROGRAMPROC>() }
		val glIsRenderbuffer: PFNGLISRENDERBUFFERPROC by lazy { wglGetProcAddressAny("glIsRenderbuffer").reinterpret2<PFNGLISRENDERBUFFERPROC>() }
		val glIsShader: PFNGLISSHADERPROC by lazy { wglGetProcAddressAny("glIsShader").reinterpret2<PFNGLISSHADERPROC>() }
		val glLinkProgram: PFNGLLINKPROGRAMPROC by lazy { wglGetProcAddressAny("glLinkProgram").reinterpret2<PFNGLLINKPROGRAMPROC>() }
		val glReleaseShaderCompiler: PFNGLRELEASESHADERCOMPILERPROC by lazy { wglGetProcAddressAny("glReleaseShaderCompiler").reinterpret2<PFNGLRELEASESHADERCOMPILERPROC>() }
		val glRenderbufferStorage: PFNGLRENDERBUFFERSTORAGEPROC by lazy { wglGetProcAddressAny("glRenderbufferStorage").reinterpret2<PFNGLRENDERBUFFERSTORAGEPROC>() }
		val glSampleCoverage: PFNGLSAMPLECOVERAGEPROC by lazy { wglGetProcAddressAny("glSampleCoverage").reinterpret2<PFNGLSAMPLECOVERAGEPROC>() }
		val glShaderBinary: PFNGLSHADERBINARYPROC by lazy { wglGetProcAddressAny("glShaderBinary").reinterpret2<PFNGLSHADERBINARYPROC>() }
		val glShaderSource: PFNGLSHADERSOURCEPROC by lazy { wglGetProcAddressAny("glShaderSource").reinterpret2<PFNGLSHADERSOURCEPROC>() }
		val glStencilFuncSeparate: PFNGLSTENCILFUNCSEPARATEPROC by lazy { wglGetProcAddressAny("glStencilFuncSeparate").reinterpret2<PFNGLSTENCILFUNCSEPARATEPROC>() }
		val glStencilMaskSeparate: PFNGLSTENCILMASKSEPARATEPROC by lazy { wglGetProcAddressAny("glStencilMaskSeparate").reinterpret2<PFNGLSTENCILMASKSEPARATEPROC>() }
		val glStencilOpSeparate: PFNGLSTENCILOPSEPARATEPROC by lazy { wglGetProcAddressAny("glStencilOpSeparate").reinterpret2<PFNGLSTENCILOPSEPARATEPROC>() }
		val glUniform1f: PFNGLUNIFORM1FPROC by lazy { wglGetProcAddressAny("glUniform1f").reinterpret2<PFNGLUNIFORM1FPROC>() }
		val glUniform1fv: PFNGLUNIFORM1FVPROC by lazy { wglGetProcAddressAny("glUniform1fv").reinterpret2<PFNGLUNIFORM1FVPROC>() }
		val glUniform1i: PFNGLUNIFORM1IPROC by lazy { wglGetProcAddressAny("glUniform1i").reinterpret2<PFNGLUNIFORM1IPROC>() }
		val glUniform1iv: PFNGLUNIFORM1IVPROC by lazy { wglGetProcAddressAny("glUniform1iv").reinterpret2<PFNGLUNIFORM1IVPROC>() }
		val glUniform2f: PFNGLUNIFORM2FPROC by lazy { wglGetProcAddressAny("glUniform2f").reinterpret2<PFNGLUNIFORM2FPROC>() }
		val glUniform2fv: PFNGLUNIFORM2FVPROC by lazy { wglGetProcAddressAny("glUniform2fv").reinterpret2<PFNGLUNIFORM2FVPROC>() }
		val glUniform2i: PFNGLUNIFORM2IPROC by lazy { wglGetProcAddressAny("glUniform2i").reinterpret2<PFNGLUNIFORM2IPROC>() }
		val glUniform2iv: PFNGLUNIFORM2IVPROC by lazy { wglGetProcAddressAny("glUniform2iv").reinterpret2<PFNGLUNIFORM2IVPROC>() }
		val glUniform3f: PFNGLUNIFORM3FPROC by lazy { wglGetProcAddressAny("glUniform3f").reinterpret2<PFNGLUNIFORM3FPROC>() }
		val glUniform3fv: PFNGLUNIFORM3FVPROC by lazy { wglGetProcAddressAny("glUniform3fv").reinterpret2<PFNGLUNIFORM3FVPROC>() }
		val glUniform3i: PFNGLUNIFORM3IPROC by lazy { wglGetProcAddressAny("glUniform3i").reinterpret2<PFNGLUNIFORM3IPROC>() }
		val glUniform3iv: PFNGLUNIFORM3IVPROC by lazy { wglGetProcAddressAny("glUniform3iv").reinterpret2<PFNGLUNIFORM3IVPROC>() }
		val glUniform4f: PFNGLUNIFORM4FPROC by lazy { wglGetProcAddressAny("glUniform4f").reinterpret2<PFNGLUNIFORM4FPROC>() }
		val glUniform4fv: PFNGLUNIFORM4FVPROC by lazy { wglGetProcAddressAny("glUniform4fv").reinterpret2<PFNGLUNIFORM4FVPROC>() }
		val glUniform4i: PFNGLUNIFORM4IPROC by lazy { wglGetProcAddressAny("glUniform4i").reinterpret2<PFNGLUNIFORM4IPROC>() }
		val glUniform4iv: PFNGLUNIFORM4IVPROC by lazy { wglGetProcAddressAny("glUniform4iv").reinterpret2<PFNGLUNIFORM4IVPROC>() }
		val glUniformMatrix2fv: PFNGLUNIFORMMATRIX2FVPROC by lazy { wglGetProcAddressAny("glUniformMatrix2fv").reinterpret2<PFNGLUNIFORMMATRIX2FVPROC>() }
		val glUniformMatrix3fv: PFNGLUNIFORMMATRIX3FVPROC by lazy { wglGetProcAddressAny("glUniformMatrix3fv").reinterpret2<PFNGLUNIFORMMATRIX3FVPROC>() }
		val glUniformMatrix4fv: PFNGLUNIFORMMATRIX4FVPROC by lazy { wglGetProcAddressAny("glUniformMatrix4fv").reinterpret2<PFNGLUNIFORMMATRIX4FVPROC>() }
		val glUseProgram: PFNGLUSEPROGRAMPROC by lazy { wglGetProcAddressAny("glUseProgram").reinterpret2<PFNGLUSEPROGRAMPROC>() }
		val glValidateProgram: PFNGLVALIDATEPROGRAMPROC by lazy { wglGetProcAddressAny("glValidateProgram").reinterpret2<PFNGLVALIDATEPROGRAMPROC>() }
		val glVertexAttrib1f: PFNGLVERTEXATTRIB1FPROC by lazy { wglGetProcAddressAny("glVertexAttrib1f").reinterpret2<PFNGLVERTEXATTRIB1FPROC>() }
		val glVertexAttrib1fv: PFNGLVERTEXATTRIB1FVPROC by lazy { wglGetProcAddressAny("glVertexAttrib1fv").reinterpret2<PFNGLVERTEXATTRIB1FVPROC>() }
		val glVertexAttrib2f: PFNGLVERTEXATTRIB2FPROC by lazy { wglGetProcAddressAny("glVertexAttrib2f").reinterpret2<PFNGLVERTEXATTRIB2FPROC>() }
		val glVertexAttrib2fv: PFNGLVERTEXATTRIB2FVPROC by lazy { wglGetProcAddressAny("glVertexAttrib2fv").reinterpret2<PFNGLVERTEXATTRIB2FVPROC>() }
		val glVertexAttrib3f: PFNGLVERTEXATTRIB3FPROC by lazy { wglGetProcAddressAny("glVertexAttrib3f").reinterpret2<PFNGLVERTEXATTRIB3FPROC>() }
		val glVertexAttrib3fv: PFNGLVERTEXATTRIB3FVPROC by lazy { wglGetProcAddressAny("glVertexAttrib3fv").reinterpret2<PFNGLVERTEXATTRIB3FVPROC>() }
		val glVertexAttrib4f: PFNGLVERTEXATTRIB4FPROC by lazy { wglGetProcAddressAny("glVertexAttrib4f").reinterpret2<PFNGLVERTEXATTRIB4FPROC>() }
		val glVertexAttrib4fv: PFNGLVERTEXATTRIB4FVPROC by lazy { wglGetProcAddressAny("glVertexAttrib4fv").reinterpret2<PFNGLVERTEXATTRIB4FVPROC>() }
        val glVertexAttribPointer: PFNGLVERTEXATTRIBPOINTERPROCFixed by lazy { wglGetProcAddressAny("glVertexAttribPointer").reinterpret2<PFNGLVERTEXATTRIBPOINTERPROCFixed>() }
	}
}

// Regresion. The original ptr: COpaquePointer? can be null
typealias PFNGLVERTEXATTRIBPOINTERPROCFixed = CPointer<CFunction<(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, ptr: COpaquePointer?) -> Unit>>
