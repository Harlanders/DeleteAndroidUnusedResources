@echo off
echo ����������ԴLOG�ļ���...
java -jar AndroidUnusedResources1.6.2.jar > AndroidUnusedResources.log
echo ɾ��������Դ��...��AndroidUnusedResources.delete�в鿴
java -jar DeleteAndroidUnusedResources.jar %cd%\AndroidUnusedResources.log > AndroidUnusedResources.delete
echo ɾ�����
pause
