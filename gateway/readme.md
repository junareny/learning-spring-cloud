端口  
eureka 8700  
producer 8801  
consumer 8802  
gateway 8901  
  
  
测试  
http://localhost:8901/get  //用httpbin网站来测试HTTP请求和响应的各种信息  
http://localhost:8901/user //测试只调用consumer的无参数接口  
http://localhost:8901/test  //测试路由断言  
http://localhost:8901/hello/somevalue //测试gateway->comsumer->producer调用关系，即调用producer接口  

