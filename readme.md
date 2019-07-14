# hw5ForAndroidCamp

3170105468-武靖超-安卓开发作业5



本次按照题给要求完成了所有的TODO栏。下记录需要注意的点：

- demo

  - 在AndroidManifest中添加权限。注意，如果使用的是wifi权限，需要ACCESS_WIFI_STATE。此外有的手机需要在应用权限中手动设置。
  - JSONObject获取时有可能出现错误，这需要try/catch或者throw抛出异常。但为了不使用户感受到异常，用try/catch
  - Gson需要定义类
  - 主线程上不能申请网络请求，非主线程不能修改ui。故申请new Thread并在其中runOnuiThread。此外，注意Thread后需要加.start()

- dou

  - Call\<T> call是post和get都需要申请的，在service模块的实际执行中生效，而后续的onResponse和onFailure是成功和失败的两种结果。

    