package com.lanchuang.wgc.androiddialog;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{
	private Button btn1;
	private Button btn2;

	private Button btn3;
	private Button btn4;

	private Button btn5;
	private Button btn6;

	private Button btn7;
	private Button btn8;

	private Button btn9;

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);

		btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(this);

		btn3 = (Button) findViewById(R.id.button3);
		btn3.setOnClickListener(this);

		btn4 = (Button) findViewById(R.id.button4);
		btn4.setOnClickListener(this);

		btn5 = (Button) findViewById(R.id.button5);
		btn5.setOnClickListener(this);

		btn6 = (Button) findViewById(R.id.button6);
		btn6.setOnClickListener(this);

		btn7 = (Button) findViewById(R.id.button7);
		btn7.setOnClickListener(this);

		btn8 = (Button) findViewById(R.id.button8);
		btn8.setOnClickListener(this);

		btn9 = (Button) findViewById(R.id.button9);
		btn9.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		// int id = item.getItemId();
		// if(id == R.id.action_settings)
		// {
		// return true;
		// }
		switch(item.getItemId())
		{
			case R.id.action_settings:
				Toast.makeText(this ,"setting" ,Toast.LENGTH_LONG).show();
				System.out.println("setting,,,");
				break;

			case R.id.设置:
				Toast.makeText(this ,"����" ,Toast.LENGTH_LONG).show();
				System.out.println("����,,,");
				break;

			case R.id.shezhi:
				Toast.makeText(this ,"shezhi" ,Toast.LENGTH_LONG).show();
				System.out.println("shezhi,,,");
				break;

			default:
				break;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v )
	{
		switch(v.getId())
		{
			case R.id.button1:
				createAlertDialog1();
				break;

			case R.id.button2:
				createAlertDialog2();
				break;

			case R.id.button3:
				createAlertDialog3();
				break;

			case R.id.button4:
				createAlertDialog4();
				break;

			case R.id.button5:
				createAlertDialog5();
				break;

			case R.id.button6:
				createAlertDialog6();
				break;

			case R.id.button7:
				createAlertDialog7();
				break;

			case R.id.button8:
				createAlertDialog8();
				break;

			case R.id.button9:
				createAlertDialog9();
				break;

			default:
				break;
		}
	}

	/**
	 * �Զ�����ʾ�ĶԻ���
	 */
	@SuppressLint("RtlHardcoded")
	private void createAlertDialog9()
	{
		Toast toast = new Toast(this);
		toast.setGravity(Gravity.CENTER | Gravity.RIGHT ,0 ,0);

		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.ic_launcher);

		TextView textView = new TextView(this);
		textView.setText("ͼƬ��Ϣ��ʾ");

		// �ڲ����в���һ��ͼƬ���
		// view.adView(imageView ,0);

		System.out.println("�Զ�����ʾͼ�ĶԻ��򣡣���");

		LinearLayout view = new LinearLayout(this);
		view.setOrientation(LinearLayout.VERTICAL);
		view.addView(textView);
		view.addView(imageView);

		toast.setView(view);
		toast.show();
	}

	/**
	 * ͬʱ��ʾͼƬ�����ֵĶԻ���
	 */
	private void createAlertDialog8()
	{
		Toast toast = Toast.makeText(this ,"ͼ����Ϣ��ʾ" ,Toast.LENGTH_LONG);
		// toast.setGravity(Gravity.CENTER_VERTICAL ,0 ,0);
		// toast.setGravity(Gravity.CLIP_VERTICAL ,0 ,0);
		toast.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
		LinearLayout view = (LinearLayout) toast.getView();
		// ���ò��ֵķ���Ϊ��ֱ����
		view.setOrientation(LinearLayout.VERTICAL);
		//
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.ic_launcher);
		// �ڲ����в���һ��ͼƬ���
		view.addView(imageView ,0);

		System.out.println("ͬʱ��ʾͼ�ĶԻ��򣡣���");

		toast.show();
	}

	/**
	 * ��ʾͼƬ�����ֵĶԻ���
	 */
	private void createAlertDialog7()
	{
		final int len = 10;
		for(int i = 0 ; i < len ; i ++ )
		{
			ImageView imageView = new ImageView(this);
			imageView.setImageResource(R.drawable.a1);
			Toast toast = new Toast(this);
			toast.setDuration(Toast.LENGTH_LONG);
			toast.setGravity(Gravity.CENTER | Gravity.TOP ,0 ,0);
			toast.setView(imageView);
			toast.show();
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				// e.printStackTrace();
				System.out.println("�����У�����");
				Toast.makeText(this ,"�����У�����" ,Toast.LENGTH_LONG);
			}
			finally
			{
				System.out.println("�����У�����");
				System.err.println("��ʾͼƬ�����ֵĶԻ��򣡣���");
				Toast.makeText(this ,"�����У�����" ,Toast.LENGTH_LONG);
			}
			ImageView imageView1 = new ImageView(this);
			imageView1.setImageResource(R.drawable.a2);
			Toast toast1 = new Toast(this);
			toast1.setDuration(Toast.LENGTH_LONG);
			toast1.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
			toast1.setView(imageView1);
			toast1.show();
			// toast.setMargin(Toast.LENGTH_LONG ,Toast.LENGTH_SHORT);
			// System.out.println(Toast.LENGTH_LONG + "\n" +
			// Toast.LENGTH_SHORT);
		}
	}

	/**
	 * �Դ�ѡ����ͼ�Ի���
	 */
	private void createAlertDialog6()
	{
		// ����һ��AlertDialog�Ĺ����߶���
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("ѡ������");
		/**
		 * �����������б� �� Ĭ��ѡ�е�ѡ�� �� null ��ʾû�� �� �¼�����
		 */
		builder.setMultiChoiceItems(names ,null ,new DialogInterface.OnMultiChoiceClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which , boolean isChecked )
			{
				Toast.makeText(MainActivity.this ,"which:" + which + "\tisChecked:" + isChecked ,Toast.LENGTH_LONG).show();
				System.out.println("which:" + which);
				System.out.println("isChecked:" + isChecked);
				// dialog.dismiss();
				// dialog.cancel();
			}
		});

		builder.setPositiveButton("�˳�" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"�˳��ɹ�������" ,Toast.LENGTH_LONG).show();
				System.out.println("�˳��ɹ�������");
			}
		});

		builder.setNegativeButton("����" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"���سɹ�������" ,Toast.LENGTH_LONG).show();
				System.out.println("���سɹ�������");
			}
		});

		builder.setNeutralButton("����" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"�����У�����" ,Toast.LENGTH_LONG).show();
				System.out.println("�����С�����");
			}
		});

		builder.setCancelable(false);
		builder.show();
	}

	/**
	 * �Զ������ͼ�Ի���
	 */
	@SuppressLint("InflateParams")
	private void createAlertDialog5()
	{
		// ����һ��AlertDialog�Ĺ����߶���
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("��¼");
		builder.setIcon(android.R.drawable.ic_dialog_info);

		/**
		 * �����Զ������ͼ �������������
		 */
		LayoutInflater inflater = getLayoutInflater();
		// LayoutInflater inflater2 = LayoutInflater.from(this);
		// ʵ�����������
		final View view = inflater.inflate(R.layout.login ,null);
		builder.setView(view);

		builder.setPositiveButton("��¼" ,new DialogInterface.OnClickListener()
		{
			@SuppressLint("NewApi")
			@Override
			public void onClick(DialogInterface dialog , int which )
			{

				EditText et_username = (EditText) view.findViewById(R.id.editText1_username);
				EditText et_password = (EditText) view.findViewById(R.id.editText2_password);
				String username = et_username.getText().toString();
				String password = et_password.getText().toString();
				if( !username.trim().isEmpty() && !password.trim().isEmpty())
				{
					Toast.makeText(MainActivity.this ,"��ϲ" + username + "��¼�ɹ�������\n" + "���������ǣ�" + password + "\n" ,Toast.LENGTH_LONG).show();
					System.out.println(username + "��¼�ɹ�������");

				}
				else
				{
					Toast.makeText(MainActivity.this ,"�˺Ż������ʽ���Ϸ�.\t��¼ʧ�ܣ�����\n" ,Toast.LENGTH_LONG).show();
					System.out.println("�˺Ż������ʽ���Ϸ�.\t��¼ʧ�ܣ�����\n");
				}
			}
		});

		builder.setNegativeButton("ȡ��" ,new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which )
			{

				Toast.makeText(MainActivity.this ,"�ɹ�ȡ��������" ,Toast.LENGTH_LONG).show();
				System.out.println("�ɹ�ȡ��������");
			}
		});

		builder.setNeutralButton("����" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"�ɹ����أ�����" ,Toast.LENGTH_LONG).show();
				System.out.println("�ɹ����أ�����");
			}
		});

		builder.setCancelable(false);
		builder.show();

	}

	/**
	 * ����ѡ��ť��ѡ��Ի���
	 */
	private void createAlertDialog4()
	{
		// ����һ��AlertDialog�Ĺ����߶���
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("ѡ�����ɣ�");
		// �����������б� �� Ĭ��ѡ�е�ѡ�� �� null ��ʾû�� �� �¼�����
		builder.setMultiChoiceItems(names ,null ,new DialogInterface.OnMultiChoiceClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which , boolean isChecked )
			{
				Toast.makeText(MainActivity.this ,"which:" + which + "\tisChecked:" + isChecked ,Toast.LENGTH_LONG).show();
				System.out.println("which:" + which);
				System.out.println("isChecked:" + isChecked);
				// dialog.dismiss();
				// dialog.cancel();
			}
		});

		builder.setCancelable(true);

		builder.show();
	}

	/**
	 * ����ѡ��ť��ѡ��Ի���
	 */
	private void createAlertDialog3()
	{
		// ����һ��AlertDialog�Ĺ����߶���
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("ѡһ���ɣ�");
		/**
		 * �����������б� �� Ĭ�ϱ�ѡ�е����� ��-1��ʾû�У� �� �����¼�����
		 */
		builder.setSingleChoiceItems(names , -1 ,new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				System.out.println(names[which] + "��ѡ�У�����");
				// dialog.dismiss();
				dialog.cancel();
			}
		});

		builder.setCancelable(false);
		builder.show();
	}

	/**
	 * ������ͨ�б�ѡ��ĶԻ���
	 */
	private void createAlertDialog2()
	{
		// ����һ��AlertDialog�Ĺ����߶���
		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setTitle("ѡһ���ɣ�");
		builder.setCancelable(false);
		builder.setIcon(android.R.drawable.ic_search_category_default);
		// builder.setIcon(android.R.drawable.status_bar_item_app_background);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		// ����ѡ���б�
		builder.setItems(names ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				System.out.println("��ѡ��" + names[which] + "-onClick,,,");
			}
		});

		builder.show();
	}

	/**
	 * ������ʾ��Ϣ�Ի���
	 */
	private void createAlertDialog1()
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("ɾ��");
		builder.setMessage("���Ҫɾ����");
		builder.setIcon(android.R.drawable.ic_delete);
		builder.setCancelable(false);
		// ȷ����ť
		builder.setPositiveButton("ȷ��" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"��ɾ��" ,Toast.LENGTH_LONG).show();
				System.out.println("��ɾ��-onClick,,,");
			}

		});
		// ȡ����ť
		builder.setNegativeButton("ȡ��" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"��ȡ��" ,Toast.LENGTH_SHORT).show();
				System.out.println("��ȡ��-onClick,,,");
			}
		});

		builder.show();

	}
}
