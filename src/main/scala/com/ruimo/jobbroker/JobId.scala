package com.ruimo.jobbroker

case class JobId(value: Long) extends AnyVal {
  def toByteArray: Array[Byte] = BigInt(value).toByteArray
}

object JobId {
  def fromByteArray(ba: Array[Byte]): JobId = JobId(BigInt(ba).toLong)
}
