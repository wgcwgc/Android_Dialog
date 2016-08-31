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

			case R.id.璁剧疆:
				Toast.makeText(this ,"设置" ,Toast.LENGTH_LONG).show();
				System.out.println("设置,,,");
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
	 * 自定义显示的对话框
	 */
	@SuppressLint("RtlHardcoded")
	private void createAlertDialog9()
	{
		Toast toast = new Toast(this);
		toast.setGravity(Gravity.CENTER | Gravity.RIGHT ,0 ,0);

		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.ic_launcher);

		TextView textView = new TextView(this);
		textView.setText("图片信息提示");

		// 在布局中插入一个图片组件
		// view.adView(imageView ,0);

		System.out.println("自定义显示图文对话框！！！");

		LinearLayout view = new LinearLayout(this);
		view.setOrientation(LinearLayout.VERTICAL);
		view.addView(textView);
		view.addView(imageView);

		toast.setView(view);
		toast.show();
	}

	/**
	 * 同时显示图片和文字的对话框
	 */
	private void createAlertDialog8()
	{
		Toast toast = Toast.makeText(this ,"图文信息提示" ,Toast.LENGTH_LONG);
		// toast.setGravity(Gravity.CENTER_VERTICAL ,0 ,0);
		// toast.setGravity(Gravity.CLIP_VERTICAL ,0 ,0);
		toast.setGravity(Gravity.CENTER_HORIZONTAL ,0 ,0);
		LinearLayout view = (LinearLayout) toast.getView();
		// 设置布局的方向为竖直方向
		view.setOrientation(LinearLayout.VERTICAL);
		//
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(R.drawable.ic_launcher);
		// 在布局中插入一个图片组件
		view.addView(imageView ,0);

		System.out.println("同时显示图文对话框！！！");

		toast.show();
	}

	/**
	 * 显示图片和文字的对话框
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
				System.out.println("休眠中！！！");
				Toast.makeText(this ,"休眠中！！！" ,Toast.LENGTH_LONG);
			}
			finally
			{
				System.out.println("休眠中！！！");
				System.err.println("显示图片和文字的对话框！！！");
				Toast.makeText(this ,"休眠中！！！" ,Toast.LENGTH_LONG);
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
	 * 自创选择视图对话框
	 */
	private void createAlertDialog6()
	{
		// 创建一个AlertDialog的构建者对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("选几个吧");
		/**
		 * 参数（数据列表 ， 默认选中的选项 ， null 表示没有 ， 事件处理）
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

		builder.setPositiveButton("退出" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"退出成功！！！" ,Toast.LENGTH_LONG).show();
				System.out.println("退出成功！！！");
			}
		});

		builder.setNegativeButton("返回" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"返回成功！！！" ,Toast.LENGTH_LONG).show();
				System.out.println("返回成功！！！");
			}
		});

		builder.setNeutralButton("中立" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"中立中，，，" ,Toast.LENGTH_LONG).show();
				System.out.println("中立中。。。");
			}
		});

		builder.setCancelable(false);
		builder.show();
	}

	/**
	 * 自定义的视图对话框
	 */
	@SuppressLint("InflateParams")
	private void createAlertDialog5()
	{
		// 创建一个AlertDialog的构建者对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("登录");
		builder.setIcon(android.R.drawable.ic_dialog_info);

		/**
		 * 设置自定义的视图 创建布局填充器
		 */
		LayoutInflater inflater = getLayoutInflater();
		// LayoutInflater inflater2 = LayoutInflater.from(this);
		// 实例化布局组件
		final View view = inflater.inflate(R.layout.login ,null);
		builder.setView(view);

		builder.setPositiveButton("登录" ,new DialogInterface.OnClickListener()
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
					Toast.makeText(MainActivity.this ,"恭喜" + username + "登录成功！！！\n" + "您的密码是：" + password + "\n" ,Toast.LENGTH_LONG).show();
					System.out.println(username + "登录成功！！！");

				}
				else
				{
					Toast.makeText(MainActivity.this ,"账号或密码格式不合法.\t登录失败！！！\n" ,Toast.LENGTH_LONG).show();
					System.out.println("账号或密码格式不合法.\t登录失败！！！\n");
				}
			}
		});

		builder.setNegativeButton("取消" ,new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which )
			{

				Toast.makeText(MainActivity.this ,"成功取消！！！" ,Toast.LENGTH_LONG).show();
				System.out.println("成功取消！！！");
			}
		});

		builder.setNeutralButton("隐藏" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"成功隐藏！！！" ,Toast.LENGTH_LONG).show();
				System.out.println("成功隐藏！！！");
			}
		});

		builder.setCancelable(false);
		builder.show();

	}

	/**
	 * 带多选按钮的选择对话框
	 */
	private void createAlertDialog4()
	{
		// 创建一个AlertDialog的构建者对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("选几个吧：");
		// 参数（数据列表 ， 默认选中的选项 ， null 表示没有 ， 事件处理）
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
	 * 带单选按钮的选择对话框
	 */
	private void createAlertDialog3()
	{
		// 创建一个AlertDialog的构建者对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		builder.setTitle("选一个吧：");
		/**
		 * 参数（数据列表 ， 默认被选中的索引 （-1表示没有） ， 监听事件处理）
		 */
		builder.setSingleChoiceItems(names , -1 ,new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				System.out.println(names[which] + "被选中，，，");
				// dialog.dismiss();
				dialog.cancel();
			}
		});

		builder.setCancelable(false);
		builder.show();
	}

	/**
	 * 创建普通列表选择的对话框
	 */
	private void createAlertDialog2()
	{
		// 创建一个AlertDialog的构建者对象
		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setTitle("选一个吧：");
		builder.setCancelable(false);
		builder.setIcon(android.R.drawable.ic_search_category_default);
		// builder.setIcon(android.R.drawable.status_bar_item_app_background);
		final String [] names =
		{ "w", "g", "c", "wgc", "nicai", "shuiya", "wobuzhidao" };
		// 设置选择列表
		builder.setItems(names ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				Toast.makeText(MainActivity.this ,names[which] ,Toast.LENGTH_LONG).show();
				System.out.println("已选择" + names[which] + "-onClick,,,");
			}
		});

		builder.show();
	}

	/**
	 * 创建提示信息对话框
	 */
	private void createAlertDialog1()
	{
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("删除");
		builder.setMessage("真的要删除吗？");
		builder.setIcon(android.R.drawable.ic_delete);
		builder.setCancelable(false);
		// 确定按钮
		builder.setPositiveButton("确定" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"已删除" ,Toast.LENGTH_LONG).show();
				System.out.println("已删除-onClick,,,");
			}

		});
		// 取消按钮
		builder.setNegativeButton("取消" ,new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog , int which )
			{
				Toast.makeText(MainActivity.this ,"已取消" ,Toast.LENGTH_SHORT).show();
				System.out.println("已取消-onClick,,,");
			}
		});

		builder.show();

	}
}
