@echo off
echo 生成无用资源LOG文件中...
java -jar AndroidUnusedResources1.6.2.jar > AndroidUnusedResources.log
echo 删除无用资源中...在AndroidUnusedResources.delete中查看
java -jar DeleteAndroidUnusedResources.jar %cd%\AndroidUnusedResources.log > AndroidUnusedResources.delete
echo 删除完成
pause
