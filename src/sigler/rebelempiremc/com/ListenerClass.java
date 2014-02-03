package sigler.rebelempiremc.com;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;


@SuppressWarnings("unused")
public class ListenerClass implements Listener
{
        private Main plugin;
        public ListenerClass(Main instance) {
          this.plugin = instance;
        }
        Map<String, Integer> login = new HashMap<String, Integer>();
	@EventHandler
	public void onJoin(PlayerJoinEvent event) 
	{
		final Player sender = event.getPlayer();
		final Player player = event.getPlayer();
		player.sendMessage("Hello");
		player.playSound(player.getLocation(), Sound.FIREWORK_BLAST, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_BLAST2, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_LARGE_BLAST, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_LARGE_BLAST2, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_TWINKLE, 2F, 1F);
		player.playSound(player.getLocation(), Sound.FIREWORK_TWINKLE2, 2F, 1F);
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        int logintask = scheduler.scheduleSyncRepeatingTask(this.plugin, new Runnable()
        {

			@Override
			public void run()
			{
				ParticleEffect.ANGRY_VILLAGER.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.CLOUD.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.CRIT.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.DEPTH_SUSPEND.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.DRIP_LAVA.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.DRIP_WATER.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.ENCHANTMENT_TABLE.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.EXPLODE.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.FIREWORKS_SPARK.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.FLAME.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.FOOTSTEP.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.HAPPY_VILLAGER.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.HEART.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.INSTANT_SPELL.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.LAVA.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.MAGIC_CRIT.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.MOB_SPELL.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.MOB_SPELL_AMBIENT.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.NOTE.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.PORTAL.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.RED_DUST.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.SLIME.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);
				ParticleEffect.WITCH_MAGIC.display(player.getLocation(), .15F, 0.15F, 0.15F, .1F, 10);	
			}
        },0L, 1L);
		login.put(sender.getName(), logintask);
        
        scheduler.scheduleSyncDelayedTask(this.plugin, new Runnable()
        {

			@Override
			public void run()
			{
				Bukkit.getScheduler().cancelTask(login.get(sender.getName()));
				login.remove(sender.getName());
			}
        }, 60L);
        
        
        
        
        


	}
}

