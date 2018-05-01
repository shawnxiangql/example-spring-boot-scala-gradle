package com.xql.example.controller

import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody, RestController}

/**
  * Created by shawn on 18-4-30.
  */
@RestController
class HelloController {

  @RequestMapping(Array("/"))
  def hello: String = "hello world"

}
