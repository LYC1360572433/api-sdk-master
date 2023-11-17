<p align="center">
    <img src=http://120.79.155.15:9000/mediafiles/e9gria4h-logo.gif width=188/>
</p>

<h1 align="center">API-SDK</h1>
<p align="center"><strong>API 接口开放平台开发者工具包</strong></p>

### 目录结构 📝

```text
apisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impi
    └─utils
```

### 导航 🧭

- **[API 接口开放平台 🔗](http://120.79.155.15:80/)**
- **[API-DOC 开发者文档 📖](http://120.79.155.15:81/)**
- **[API-SDK-demo ✔️](http://github.com/LYC1360572433/api/api-sdk-demo-master)**

###  快速开始 🚀

**要开始使用 API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
   <groupId>io.github.lyc1360572433</groupId>
   <artifactId>api-sdk</artifactId>
   <version>0.0.1</version>
</dependency>   
```

**可以搭配[EasyWeb](https://github.com/LYC1360572433/EasyWeb)依赖快速启动Web项目**

```xml
  <dependency>
     <groupId>io.github.lyc1360572433</groupId>
     <artifactId>EasyWeb</artifactId>
     <version>0.0.1</version>
  </dependency>
```

#### 2. 前往[API 接口开放平台](http://120.79.155.15:80/) 获取开发者密钥对

#### 3. 初始化客户端ApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  ApiClient client = new ApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # API 配置
    lyc:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
    #EasyWeb配置，使用EasyWeb需要配置以下
    spring:
      mvc:
        path match:
          matching-strategy: ant_path_matcher
    ```
  
  - properties
  
    ```properties
    lyc.api.client.access-key=你的 accessKey
    lyc.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
    @Resource
    private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机毒鸡汤

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    ApiClient apiClient = new ApiClient("你的 accessKey", "你的 secretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(apiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```

**搭配[EasyWeb](https://github.com/LYC1360572433/EasyWeb)示例：推荐👍**

```java
@GetMapping("/getPoisonousChickenSoup")
public BaseResponse<PoisonousChickenSoupResponse> getPoisonousChickenSoup() {
        PoisonousChickenSoupResponse poisonousChickenSoup = null;
        try {
        poisonousChickenSoup = apiService.getPoisonousChickenSoup();
        } catch (ApiException e) {
        throw new ApiException(e.getCode(), e.getMessage());
        }
        return ResultUtils.success(poisonousChickenSoup);
        }
```

响应示例：

```json
{
  "code": 0,
  "data": {
    "text": "人类三大错觉—手机响了，有人敲门，他（她）喜欢我。"
  },
  "message": "ok"
}
```
- **更多示例详见：[API-SDK-Demo 示例项目](http://github.com/LYC1360572433/api/api-sdk-demo-master)**
- **更多接口详见：[API-DOC 开发者文档](http://120.79.155.15:81/)**

### 贡献 🤝

如果您想为 **[API 接口开放平台](http://120.79.155.15:80/)**  做出贡献，请随时提交拉取请求。我们始终在寻找方法来改进项目，使其对像您这样的开发者更有用。

### 联系我们 📩

如果您对 **[API 接口开放平台](http://120.79.155.15:80/)**  平台有任何问题或建议，请随时联系我们:📩邮箱：1360572433@qq.com。

感谢您使用 **[API 接口开放平台](http://120.79.155.15:80/)**  ！ 😊
