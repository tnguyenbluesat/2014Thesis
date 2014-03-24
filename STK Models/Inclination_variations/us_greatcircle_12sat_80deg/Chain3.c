stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/700km_80deg_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_80deg_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_80deg_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_80deg_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    7553.5543519328403
    Stop     7808.4526476516139
    Start    13488.403596400396
    Stop     13735.716450688118
    Start    19474.846206690425
    Stop     19599.777386822294
    Start    65781.307340387313
    Stop     66537.08828125459
    Start    71714.813202041289
    Stop     72534.012927959237
    Start    77970.645854043687
    Stop     78488.109601116506
    Start    149210.34858301803
    Stop     149551.32761793589
    Start    155220.6424953712
    Stop     155512.36975040816
    Start    191543.14731713053
    Stop     191719.64123526332
    Start    197597.0100841086
    Stop     198140.07225703643
    Start    268607.7380190448
    Stop     268855.9601136726
    Start    274577.61453811167
    Stop     275286.67978978821
    Start    280591.50406693149
    Stop     281377.58881361736
    Start    286825.34311231162
    Stop     286921.53325574409
    Start    333003.45141783473
    Stop     333615.9612861583
    Start    351676.68086235027
    Stop     352118.79685450147
    Start    357620.93517210404
    Stop     358170.34689609829
    Start    363611.59899081738
    Stop     364072.84560295963
    Start    369672.09948574769
    Stop     369989.62563735549
    Start    410197.73403504072
    Stop     410674.71474513575
    Start    415865.48799619556
    Stop     416667.1049323621
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

