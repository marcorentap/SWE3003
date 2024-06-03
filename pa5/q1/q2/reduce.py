#!/usr/bin/python3
import sys

players_map = {} # name => (goals, assists)
dominated_map = {} # name => [name2 if name2 dominates name]

# Store player information
for line in sys.stdin:
    line = line.strip().split(',')
    name, goals, assists = line
    players_map[name] = (int(goals), int(assists))

# Compute dominated_map
for name, (goals, assists) in players_map.items():
    for name2, (goals2, assists2) in players_map.items():
        if name == name2:
            continue

        if name2 not in dominated_map:
            dominated_map[name2] = []

        # Condition 1
        # attrs of name >= attrs of name2 
        if goals >= goals2 and assists >= assists2:
            # Condition 2
            # At least one attr of name > attr of name2
            if goals > goals2 or assists > assists2:
                dominated_map[name2].append(name)

# Nominees are players that are not dominated by any other player
nominees = []
for name, dominators in dominated_map.items():
    if len(dominators) == 0:
        nominees.append(name)
print("\n".join(sorted(nominees)))
