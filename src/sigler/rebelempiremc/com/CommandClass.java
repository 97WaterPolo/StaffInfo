package sigler.rebelempiremc.com;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandClass implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		final Player player = (Player) sender;	

		if (cmd.getName().equalsIgnoreCase("info")) //|| (cmd.getName().equalsIgnoreCase("serverinfo")) || (cmd.getName().equalsIgnoreCase("si")))
		{
			if (sender.hasPermission("remc.multiple.info"))
			{
				if (args.length == 0)
				{
                    player.sendMessage(ChatColor.DARK_PURPLE + "-------" + ChatColor.YELLOW + " Server Information " + ChatColor.DARK_PURPLE + "-------");
                    player.sendMessage(ChatColor.GOLD + "/info Operator" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about Operators.");
                    player.sendMessage(ChatColor.GOLD + "/info Dev" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about our Developers.");
                    player.sendMessage(ChatColor.GOLD + "/info ServerAdmin" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about ServerAdmins.");
                    player.sendMessage(ChatColor.GOLD + "/info Admin" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about Admins.");
                    player.sendMessage(ChatColor.GOLD + "/info Mod" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about Moderators.");
                    player.sendMessage(ChatColor.GOLD + "/info Trainee" + ChatColor.BLACK + " - " + ChatColor.GREEN + "Shows info about Trainees.");
				}
				if (!(args.length == 0))
				{
					if ((args[0].equalsIgnoreCase("op")) || ((args[0].equalsIgnoreCase("operator"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.DARK_RED + " Operators " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current Operators:" + ChatColor.AQUA + "iiPoseidon ; 97WaterPolo");
	                    player.sendMessage(ChatColor.GREEN + "Operator's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "Operator's main job is to ensure that the server runs smoothly and can be managed on its own. iiPoseidon is in charge of all in game aspects of the server ranging from Creator applications, to building the spawn. 97WaterPolo is the server monkey who works on keeping the sevrers up and running, plugins updated, permissions in check, etc. Together these two make up the 2 owners of RebelEmpireMC and they will always be here for the sevrer! ");
	                    
					}
					if ((args[0].equalsIgnoreCase("dev")) || ((args[0].equalsIgnoreCase("dev"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.GOLD + " Developers " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current Developers:" + ChatColor.AQUA + "Axe2760 ; 97WaterPolo");
	                    player.sendMessage(ChatColor.GREEN + "Developer's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "The main job for our developers is to ensure the server stays updated with the current minecraft version as well as run smoothly. They create plugins which allow modification of minecraft and take ideas from the forum into consideration when making new ones. As of now, our developers are working on an alternative land protection aas well as particle trails for fun!");
	                    
					}
					if ((args[0].equalsIgnoreCase("serveradmin")) || ((args[0].equalsIgnoreCase("sa"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.RED + " Sevrer Admins " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current ServerAdmins:" + ChatColor.AQUA + "manley07 ; rockers319");
	                    player.sendMessage(ChatColor.GREEN + "ServerAdmin's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "ServerAdmins are in charge of running the server in case Operators are unavailable. They are also in charge of monitoring staff as well as determining whether or not a player is ready to join our staff team. They server as the bridge between players and staff, they listen to player's ideas and share suggestions and comments to the rest of the staff.");
	                    
					}
					if ((args[0].equalsIgnoreCase("admin")) || ((args[0].equalsIgnoreCase("a"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.AQUA + " Admins " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current Admins:" + ChatColor.AQUA + "_BenMon_ ; ahurry ; Killer_Pepper ; PinkifiedPaws");
	                    player.sendMessage(ChatColor.GREEN + "Admin's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "Admin's are a critical part of our server. They are the ones charged with teaching new staff the ropes as well as rules that staff have to adhere to. They are in charge of any issues that may arise in the server in game whether that be a simple protection or an exploit or bug. If something is amiss, they will be sure to be there to fix it!");
	                    
					}
					if ((args[0].equalsIgnoreCase("mod")) || ((args[0].equalsIgnoreCase("moderator"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.DARK_GREEN + " Moderators " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current Admins:" + ChatColor.AQUA + "none");
	                    player.sendMessage(ChatColor.GREEN + "Moderator's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "Moderators are in charge of the every day stuff that we experience. This being build protections, rolling back griefs, as well as punishing players for comminiting offenses. They are essentially the people who keep this server under order!");
					}
					if ((args[0].equalsIgnoreCase("trainee")) || ((args[0].equalsIgnoreCase("t"))))
					{
	                    player.sendMessage(ChatColor.WHITE + "-------" + ChatColor.DARK_GRAY + " Trainees " + ChatColor.WHITE + "-------");
	                    player.sendMessage(ChatColor.YELLOW + "Current Trainees:" + ChatColor.AQUA + "_BenMon_ ; ahurry ; Killer_Pepper ; PinkifiedPaws");
	                    player.sendMessage(ChatColor.GREEN + "Trainee's Jobs:");
	                    player.sendMessage(ChatColor.GRAY + "Trainee's are staff that are currently being trained in the way of doing staff duties. They are being taught how to establish protections, how to rollback, how to use forums, as well as many things. This is a temp rank and depending how fast they learn, they will be promoted to Moderator!");
	                    
					}
				}
			}
			else
			{
				player.sendMessage("You do not have permission");
			}
		}
		return true;
	}

}