1. 上传优惠券 token
    GET: 127.0.0.1:9528/upload
    merchantsId: 1
    PassTemplateId:  fb91677cae183c3de5af29ea5c33c3d2
   
2. 创建用户, 用户id: 307307
    POST: 127.0.0.1:9528/passbook/createuser
```json
    {
      "baseInfo": {
        "name": "bitte",
        "age": 25,
        "sex": "nosex"
      },
     "otherInfo": {
       "phone": "1213",
       "address": "berlin"
       
     }
}
```
3. 库存信息
   GET: 127.0.0.1:9528/passbook/inventoryinfo?userId=307307
   
4. 获取优惠券， 获取带有token的优惠券
   POST: 127.0.0.1:9528/passbook/gainpasstemplate
   
```json
    {
        "userId": 307307,
        "passTemplate": {
          "id": 1,
          "title": "优惠券-2",
          "hasToken": true
        }
                
                
   }
```
5. userpassinfo
   GET: 127.0.0.1:9528/passbook/userpassinfo?userId=307307
   
6. userusepassinfo
   GET: 127.0.0.1:9528/passbook/userusepassinfo?userId=307307
   
7. userusepass
   POST: 127.0.0.1:9528/passbook/userusepass
   
```json
    {
    "userId": 307307,
    "templateId": "fb91677cae183c3de5af29ea5c33c3d2"
}

```
8. 创建评论信息
   POST: 127.0.0.1:9528/passbook/createfeedback
   
```json
    {
      "userId": 307307,
      "type": "app",
      "templateId": -1,
      "comment": "longlive"
}
```
```json
{
  "userId": 307307,
  "type": "pass",
  "templateId": "fb91677cae183c3de5af29ea5c33c3d2",
  "comment": "longlive"
}

    
```
9. 查看评论信息
   PGET: 127.0.0.1:9528/passbook/getfeedback?=307307