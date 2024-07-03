# Path to your # Zsh Syntax Highlighting
source $ZSH_CUSTOM/plugins/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh

# Fast directory navigation
zstyle ':completion:*' matcher-list 'm:{a-zA-Z}={A-Za-z}'

# Add Homebrew to PATH (M1 Mac)
export PATH="/opt/homebrew/bin:/opt/homebrew/sbin:$PATH"

# Customize prompt with Powerlevel10k source (M1 Mac)
source /opt/homebrew/opt/powerlevel10k/powerlevel10k.zsh-theme

# Add Java to PATH
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH

oh-my-zsh installation.
export ZSH="$HOME/.oh-my-zsh"

# Customize Src
source /opt/homebrew/opt/powerlevel10k/powerlevel10k.zsh-theme


# Export Path to Homebrew
export PATH="/opt/homebrew/bin:/opt/homebrew/sbin:$PATH"

# Set name of the theme to load
ZSH_THEME="powerlevel10k/powerlevel10k"

# Add Maven to PATH
export M2_HOME=/usr/local/opt/maven
export PATH=$M2_HOME/bin:$PATH

# Uncomment the following line to use case-sensitive completion.
# CASE_SENSITIVE="true"

# Uncomment the following line to use hyphen-insensitive completion.
# CASE_SENSITIVE="true"

# Uncomment the following line to disable bi-weekly auto-update checks.
# DISABLE_AUTO_UPDATE="true"

# Uncomment the following line to change how often to auto-update (in days).
# export UPDATE_ZSH_DAYS=13

# Uncomment the following line to disable colors in ls.
# DISABLE_LS_COLORS="true"

# Uncomment the following line to disable auto-setting terminal title.
# DISABLE_AUTO_TITLE="true"

# Uncomment the following line to use another terminal emulator key bindings (less/more).
# TERM="xterm-256color"

# Uncomment the following line to enable command auto-correction.
ENABLE_CORRECTION="true"

# Uncomment the following line to display red dots whilst waiting for completion.
# COMPLETION_WAITING_DOTS="true"

# Uncomment the following line if pasting URLs and other text is handled by bracketed-paste-magic.
ENABLE_BRACKETED_PASTE="true"

# Uncomment the following line if you want to use a different editor.
export EDITOR='nano'

# Set the plugins to use
plugins=(git zsh-autosuggestions zsh-syntax-highlighting)

source $ZSH/oh-my-zsh.sh

# Add Powerlevel10k theme configuration
if [[ -r ~/.p10k.zsh ]]; then
  source ~/.p10k.zsh
fi

# Customization options
HIST_STAMPS="mm/dd/yyyy"

# Aliases
alias ll='ls -la'
alias l='ls -CF'
alias gs='git status'
alias gp='git pull'
alias gl='git log'

# Enable Powerlevel10k instant prompt. Should stay close to the top of ~/.zshrc.
if [[ -r ~/.p10k-instant-prompt.zsh ]]; then
  source ~/.p10k-instant-prompt.zsh
fi

# Customize terminal appearance
export TERM="xterm-256color"
export CLICOLOR=1
export LSCOLORS=ExFxBxDxCxegedabagacad

# Load additional plugins
ZSH_CUSTOM=$ZSH/custom

# Zsh Autosuggestions
ZSH_AUTOSUGGEST_HIGHLIGHT_STYLE='fg=10'

# Zsh Syntax Highlighting
source $ZSH_CUSTOM/plugins/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh

# Fast directory navigation
zstyle ':completion:*' matcher-list 'm:{a-zA-Z}={A-Za-z}'

# Add path for custom scripts
export PATH=$HOME/bin:/usr/local/bin:$PATH

# Customize prompt with Powerlevel10k source 
/usr/local/share/zsh-theme-powerlevel10k/powerlevel10k.zsh-theme

export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion

# >>> conda initialize >>>
# !! Contents within this block are managed by 'conda init' !!
__conda_setup="$('/opt/anaconda3/bin/conda' 'shell.zsh' 'hook' 2> /dev/null)"
if [ $? -eq 0 ]; then
    eval "$__conda_setup"
else
    if [ -f "/opt/anaconda3/etc/profile.d/conda.sh" ]; then
        . "/opt/anaconda3/etc/profile.d/conda.sh"
    else
        export PATH="/opt/anaconda3/bin:$PATH"
    fi
fi
unset __conda_setup
# <<< conda initialize <<<

# Zsh Syntax Highlighting
source $ZSH_CUSTOM/plugins/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh

# Fast directory navigation
zstyle ':completion:*' matcher-list 'm:{a-zA-Z}={A-Za-z}'

# Add path for custom scripts
export PATH=$HOME/bin:/usr/local/bin:$PATH  

# Customize prompt with Powerlevel10k source
source /usr/local/opt/powerlevel10k/powerlevel10k.zsh-theme

export NVM_DIR="$HOME/.nvm" 
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion
  
# >>> conda initialize >>>
# !! Contents within this block are managed by 'conda init' !!
__conda_setup="$('/opt/anaconda3/bin/conda' 'shell.zsh' 'hook' 2> /dev/null)"
if [ $? -eq 0 ]; then   
    eval "$__conda_setup"
else
    if [ -f "/opt/anaconda3/etc/profile.d/conda.sh" ]; then
        . "/opt/anaconda3/etc/profile.d/conda.sh"
    else
        export PATH="/opt/anaconda3/bin:$PATH"
    fi
fi
unset __conda_setup
# <<< conda initialize <<<

# Add Maven to PATH
export M2_HOME=/usr/local/opt/maven
export PATH=$M2_HOME/bin:$PATH

