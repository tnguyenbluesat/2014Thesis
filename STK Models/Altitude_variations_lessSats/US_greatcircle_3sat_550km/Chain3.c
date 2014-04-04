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
    Object  Satellite/550km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/550km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/550km_p1_1/Receiver/adsb_satrcvr2 To Satellite/550km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1100.5870312407264
    Stop     1824.3828771961269
    Start    7069.6055343654516
    Stop     7619.2932851274973
    Start    13010.998201018419
    Stop     13334.470523138991
    Start    18993.584245089136
    Stop     19062.201386146906
    Start    69396.062319129473
    Stop     70061.269396950054
    Start    75248.533559047719
    Stop     75981.60506997483
    Start    81221.283684101727
    Stop     81733.810858146375
    Start    87220.531008269507
    Stop     87434.935764312482
    Start    191272.08971027043
    Stop     191283.54345380559
    Start    259457.78973073364
    Stop     259483.90351574848
    Start    265410.6136700256
    Stop     265679.76608632179
    Start    271356.30488143099
    Stop     271820.59973271232
    Start    277440.66805938428
    Stop     277688.86702488048
    Start    339587.71940777352
    Stop     340101.43309706345
    Start    345575.05459984898
    Stop     346231.11376945418
    Start    351523.67949631828
    Stop     352291.06615350803
    Start    357474.07170769403
    Stop     357985.94728728943
    Start    413881.43928785319
    Stop     414451.83189089136
    Start    419710.86724592943
    Stop     420468.81335770612
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

