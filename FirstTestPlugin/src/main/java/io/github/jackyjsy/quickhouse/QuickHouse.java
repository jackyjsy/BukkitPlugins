package io.github.jackyjsy.quickhouse;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class QuickHouse extends JavaPlugin 
{
    @Override
    public void onEnable() 
    {
    	// 插件载入时要执行的代码（略）
    	getLogger().info("onEnable has been invoked!");
    	this.getConfig();
    	this.saveConfig();
    	System.out.print(this.getDataFolder());
    	File newfile = new File(this.getDataFolder(), "houseconfig.txt");
    	if (!newfile.exists())
    	{
    		try 
    		{
				newfile.createNewFile();
			} catch (IOException e) 
    		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
    	}
    }
    
    @Override
    public void onDisable() 
    {
    	getLogger().info("onDisable has been invoked!");
        // 插件卸载时要执行的代码（略）
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
    {
        if (cmd.getName().equalsIgnoreCase("quickhouse")) 
        { // 如果玩家输入了/quickhouse则执行如下内容...
        // 所需要执行的事（此处略）
        	if (!(sender instanceof Player))
        	{ //如果sender与Player类不匹配
                sender.sendMessage("这个指令只能让玩家使用。");
            } else 
            {
            	getLogger().info("quickhouse command has been invoked!");
            }
        	return true;
        } //如果以上内容成功执行，则返回true 
        // 如果执行失败，则返回false.
        return false;
    }
}
