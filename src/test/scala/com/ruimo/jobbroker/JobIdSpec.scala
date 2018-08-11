package com.ruimo.jobbroker

import org.specs2.mutable._

class JobIdSpec extends Specification {
  "JobId" should {
    "convert tot array of byte." in {
      val jobId = JobId.fromByteArray(Array[Byte](1, 2, 3, 4, 5, 6, 7, 8))
      jobId.value === 0x0102030405060708L
      val a0 = jobId.toByteArray
      a0(0) === 1
      a0(1) === 2
      a0(2) === 3
      a0(3) === 4
      a0(4) === 5
      a0(5) === 6
      a0(6) === 7
      a0(7) === 8
    }

    "convert tot array of byte for large value." in {
      val jobId = JobId.fromByteArray(Array[Byte](0x80.asInstanceOf[Byte], 2, 3, 4, 5, 6, 7, 8))
      jobId.value === 0x8002030405060708L
      val a0 = jobId.toByteArray
      a0(0) === 0x80.asInstanceOf[Byte]
      a0(1) === 2
      a0(2) === 3
      a0(3) === 4
      a0(4) === 5
      a0(5) === 6
      a0(6) === 7
      a0(7) === 8
    }
  }
}
